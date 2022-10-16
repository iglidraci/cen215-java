package binaryio;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        String filePath = TestFileStream.DATA_DIR + "/scores.dat";
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeUTF("Mary");
            outputStream.writeBoolean(true);
            outputStream.writeDouble(2.3);
            outputStream.writeChars("yep yaa");
            try(DataInputStream inputStream = new DataInputStream(new FileInputStream(filePath))) {
                System.out.println(inputStream.readUTF());
                System.out.println(inputStream.readBoolean());
                System.out.println(inputStream.readDouble());
                StringBuilder str = new StringBuilder();
                try {
                    while (true)
                        str.append(inputStream.readChar());
                } catch (EOFException eofException) {
                    System.out.println(str);
                    System.out.println("All data were read");
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
