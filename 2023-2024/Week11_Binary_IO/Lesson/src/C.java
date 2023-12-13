import java.io.*;

public class C implements Serializable {

    @Serial
    private static final long serialVersionUID = -4918249600319820779L;
    public int v1;
    public static double v2;
    public transient A v3 = new A();
    public transient A v4 = new A();

    @Override
    public String toString() {
        return "C{" +
                "v1=" + v1 +
                ", v3=" + v3 +
                '}';
    }
}

class A {} // not serializable


class Main {
    public static void main(String[] args) {
        C c1 = new C();
        c1.v1 = 1;
        C c2 = new C();
        c2.v1 = 10;
        writeToFile(c1, c2);

        readFromFile();

    }

    static void readFromFile() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Cs.dat"))) {
            while (true) {
                C c = (C) inputStream.readObject();
                System.out.println(c);
            }
        }
        catch (EOFException ex) {
            System.out.println("end of file");
        }
        catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void writeToFile(C... objs) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Cs.dat"))) {
            for(C c: objs)
                outputStream.writeObject(c);
        } catch (IOException ignored) {

        }
    }
}