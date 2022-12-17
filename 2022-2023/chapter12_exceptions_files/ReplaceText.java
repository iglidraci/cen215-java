import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws IOException {
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText srcFile targetFile oldString newString");
            System.exit(1);
        }
        File srcFile = new File(args[0]);
        if (!srcFile.exists()) {
            System.out.println("Source file doesn't exist");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file already exists");
            System.exit(3);
        }
        try(Scanner input = new Scanner(srcFile);
            PrintWriter writer = new PrintWriter(targetFile)
        ) {
            while (input.hasNext()) {
                String line = input.nextLine();
                String newLine = line.replaceAll(args[2], args[3]);
                writer.println(newLine);
            }
        }
    }
}
