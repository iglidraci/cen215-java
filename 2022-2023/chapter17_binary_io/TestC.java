import java.io.*;

public class TestC {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "data/object_c.dat";
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(filename))) {
            C c = new C();
            c.setV1(100);
            System.out.println(c.getV1());
            System.out.println(c.getV3());
            writer.writeObject(c);
        }
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(filename))) {
            C c = (C) reader.readObject();
            System.out.println(c.getV1());
            System.out.println(c.getV3());
        }
    }
}
