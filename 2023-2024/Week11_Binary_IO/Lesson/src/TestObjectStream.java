import java.io.*;
import java.math.BigDecimal;
import java.util.Date;

public class TestObjectStream {
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.dat"))) {
            outputStream.writeObject(new Date());
            outputStream.writeObject(new BigDecimal("100"));
        } catch (IOException ignored) {

        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.dat"))) {
            Date date = (Date) inputStream.readObject();
            BigDecimal decimal = (BigDecimal) inputStream.readObject();
            System.out.println(date);
            System.out.println(decimal);
        } catch (IOException ignored) {

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
