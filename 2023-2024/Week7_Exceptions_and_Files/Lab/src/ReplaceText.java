import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Wrong usage");
            System.exit(1);
        }
        String filePath = args[0];
        String oldName = args[1];
        String newName = args[2];
        File file = new File(filePath);
        if(!file.exists()) {
            System.out.println("File doesn't exist");
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();

        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine().replace(oldName, newName) + "\n");
            }

        } catch (IOException ex) {

        }

        try(PrintWriter pw = new PrintWriter(file)) {
            pw.println(sb);
        } catch (IOException ex) {

        }
    }
}
