import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath, oldString, newString;
        filePath = scanner.next(); oldString = scanner.next(); newString = scanner.next();
        File file = new File(filePath);
        try {
            StringBuilder sb = new StringBuilder();
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                sb.append(reader.nextLine().replace(oldString, newString)).append('\n');
            }
            reader.close();
            PrintWriter writer = new PrintWriter(file);
            writer.print(sb);
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        }
    }
}
