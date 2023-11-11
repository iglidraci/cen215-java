import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("files/scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter writer = new PrintWriter(file);
        /*
          Invoking the constructor of PrintWriter will create a new file if the file does not exist
          If the file already exists, the current content in the file will be discarded without verifying with the user
          Invoking the constructor of PrintWriter may throw an I/O exception
          For simplicity, we declare throws IOException in the main method header
         */
        writer.print("Foo ");
        writer.println(50);
        writer.printf("%s %d", "Bar", 40);
        writer.close();
        /*
            Closing Resources Automatically Using try-with-resources
            The resources must be a subtype of AutoCloseable such as a PrinterWriter that has the close() method.
            Using try-with-resources can not only avoid errors, but also make the code simpler
         */
    }
}
