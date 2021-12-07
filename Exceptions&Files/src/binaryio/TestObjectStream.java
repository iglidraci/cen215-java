package binaryio;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class TestObjectStream {
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(TestFileStream.DATA_DIR + "/object.dat"))){
            outputStream.writeObject(new Date());
            outputStream.writeObject("Hello world");
            outputStream.writeObject(Integer.parseInt("123"));
            String[] arr = {"Jon Jones", "Petr Yan", "Gilbert Burns"};
            outputStream.writeObject(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(TestFileStream.DATA_DIR + "/object.dat"))){
             Date dateRead = (Date) inputStream.readObject();
             System.out.println("Date read from the file: " + dateRead);
             String str = (String) inputStream.readObject();
             Integer i = (Integer) inputStream.readObject();
            System.out.println("Str read " + str);
            System.out.println("integer read " + i);
            String[] arrRead = (String[]) inputStream.readObject();
            System.out.println("array read " + Arrays.toString(arrRead));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
