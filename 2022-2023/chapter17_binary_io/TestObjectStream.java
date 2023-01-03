import java.io.*;
import java.util.Date;

public class TestObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "data/objects.dat";
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename))) {
            writer.writeDouble(2.45);
            writer.writeUTF("Foo");
            writer.writeObject(new Date());
        }
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println(reader.readDouble());
            System.out.println(reader.readUTF());
            Date date = (Date) reader.readObject(); // Since readObject() returns an Object
            System.out.println(date);
        }
    }
}
