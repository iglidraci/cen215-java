package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        File file = new File(TestFileClass.CWD + "/data/scores.txt");
        try(Scanner scanner = new Scanner(file)) {
            System.out.println("Reading scores from the file");
            while (scanner.hasNext()) {
                // nextLine will read the whole line
                // System.out.println(scanner.nextLine());
                // next will split them by the delimiter
                String name = scanner.next();
                int score = scanner.nextInt();
                System.out.println(name + " has " + score + " points");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
