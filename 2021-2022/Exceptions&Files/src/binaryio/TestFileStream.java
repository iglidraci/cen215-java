package binaryio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static String DATA_DIR = "Exceptions&Files/data";

    public static void main(String[] args) {
        try {
            String path = DATA_DIR + "/test.dat";
            FileOutputStream outputStream = new FileOutputStream(path);
            for (int i = 1; i < 10; i++) {
                outputStream.write(i);
            }
            outputStream.close();
            FileInputStream inputStream = new FileInputStream(path);
            int value;
            while ((value= inputStream.read()) != -1) {
                System.out.print(value + " ");
            }
            inputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
