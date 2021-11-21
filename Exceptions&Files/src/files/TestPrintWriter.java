package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class TestPrintWriter {
    public static void main(String[] args) {
        File file = new File(TestFileClass.CWD + "/data/scores.txt");
        Random random = new Random();
        String[] names = {"John", "Nate", "Mark", "Dennis"};
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(2);
        }
        try(PrintWriter writer = new PrintWriter(file)) {
            for(String name: names){
                writer.println(name + " " + random.nextInt(40, 101));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
