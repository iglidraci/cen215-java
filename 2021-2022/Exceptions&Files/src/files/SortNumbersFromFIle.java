package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SortNumbersFromFIle {
    public static void main(String[] args) {
        File file = new File(TestFileClass.CWD + "/data/numbers.txt");
        Random random = new Random();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < 100; i++) {
                printWriter.print(random.nextInt() + " ");
            }
            printWriter.close();
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<>();
            while (scanner.hasNext())
                list.add(scanner.nextInt());
            Collections.sort(list);
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
