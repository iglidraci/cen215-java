package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        if (args.length != 4)
            exitApp("App usage should be: java ReplaceText sourceFile targetFile oldString newString");
        String srcPath = TestFileClass.CWD + args[0];
        String desPath = TestFileClass.CWD + args[1];
        File source = new File(srcPath);
        File target = new File(desPath);
        if (!source.exists())
            exitApp("Source file doesn't exits");
        if (target.exists())
            exitApp("Target file exits");
        try(Scanner scanner = new Scanner(source)) {
            PrintWriter writer = new PrintWriter(target);
            while (scanner.hasNext())
                writer.println(scanner.nextLine().replaceAll(args[2], args[3]));
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void exitApp(String printMessage) {
        System.out.println(printMessage);
        System.exit(1);
    }
}
