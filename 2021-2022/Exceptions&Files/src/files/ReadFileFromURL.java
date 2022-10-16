package files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("App usage should be: ReadFileFromURL company url");
            System.exit(1);
        }
        try {
            URL url = new URL(args[1]);
            File file = new File(TestFileClass.CWD + "/data/" + args[0] + ".html");
            PrintWriter writer = new PrintWriter(file);
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext())
                writer.println(scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
