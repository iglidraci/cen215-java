package binaryio;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(TestFileStream.DATA_DIR + "/integers.dat", "rw")){
            for (int i = 0; i < 200; i++)
                randomAccessFile.writeInt(i+1);
            System.out.println("Size of the file " + randomAccessFile.length() + " bytes");
            randomAccessFile.seek(4);

            randomAccessFile.writeInt(1000);
            randomAccessFile.seek(4);
            System.out.println("Number in the second position is " + randomAccessFile.readInt());
            System.out.println("Adding new number");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeInt(5000);
            System.out.println("Size of the file " + randomAccessFile.length() + " bytes");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
