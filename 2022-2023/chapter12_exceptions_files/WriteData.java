import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(1);
//        }
        PrintWriter writer = new PrintWriter(file);
        /**
         * Invoking the constructor of PrintWriter will create a new file if the file does not exist
         * If the file already exists, the current content in the file will be discarded without verifying with the user
         * Invoking the constructor of PrintWriter may throw an I/O exception
         */
        writer.print("Foo ");
        writer.println(50);
        writer.printf("%s %d", "Bar", 40);
        writer.close();
        // Closing Resources Automatically Using try-with-resources
    }
}
