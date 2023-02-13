import java.io.*;

public class AnimalHandler {
    private static final String FILE_NAME  = "animals.ser";
    public static void write(Animal animal) {
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            writer.writeObject(animal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Animal read() {
        try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (Animal) reader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
