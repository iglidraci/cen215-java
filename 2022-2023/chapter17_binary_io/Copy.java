import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Copy srcFile targetFile");
            System.exit(1);
        }
        File srcFile = new File(args[0]);
        if (!srcFile.exists()) {
            System.out.println("Source file doesn't exist");
            System.exit(1);
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file already exists");
            System.exit(1);
        }
        try(
                FileInputStream reader = new FileInputStream(srcFile);
                FileOutputStream writer = new FileOutputStream(targetFile)
        ) {
            int data;
            int byteLength = 0;
            while((data = reader.read()) != -1) {
                writer.write(data);
                byteLength++;
            }
            System.out.println("Byte length: " + byteLength);
        }
    }
}
