import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        String filename = "data/numbers.dat";
        try(FileOutputStream writer = new FileOutputStream(filename, true)) {
            for (int i = 250; i <= 260; i++) {
                writer.write(i);
            }
        }
        try(FileInputStream reader = new FileInputStream(filename)) {
            int nr;
            while ((nr = reader.read()) != -1){ // the input value of -1 signifies the end of file
                System.out.println(nr);
            }
        }
    }
}
