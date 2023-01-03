import java.io.*;

/**
 * The basic byte input stream provides a read method that can be used only for reading bytes.
 * If you want to read integers, doubles, or strings, you need a filter class to wrap the byte input stream.
 * Using a filter class enables you to read integers, doubles, and strings instead of bytes and characters
 */
public class TestDataStream {
    public static void main(String[] args) throws IOException {
        String filename = "data/data.dat";
        try(DataOutputStream writer = new DataOutputStream(new FileOutputStream(filename))) {
            writer.writeInt(400); // id
            writer.writeUTF("Foo"); // name
            writer.writeDouble(20.45); // score
            writer.writeInt(450); // id
            writer.writeUTF("Bar");
            writer.writeDouble(90.45);
        }
        try(DataInputStream reader = new DataInputStream(new FileInputStream(filename))) {
            int id = reader.readInt();
            String name = reader.readUTF();
            double score = reader.readDouble();
            System.out.printf("Id: %d, name: %s, score: %.2f \n", id, name, score);
            id = reader.readInt();
            name = reader.readUTF();
            score = reader.readDouble();
            System.out.printf("Id: %d, name: %s, score: %.2f \n", id, name, score);
            /*
            If you keep reading data at the end of an InputStream, an EOFException will occur.
            This exception can be used to detect the end of a file
            * */
        }
    }
}
