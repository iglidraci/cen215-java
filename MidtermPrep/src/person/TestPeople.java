package person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestPeople {
    public static void main(String[] args) {
        PersonList list = new PersonList(2);
        list.addPerson(new Person("Jon", "Jones", 32));
        list.addPerson(new Person("Jose", "Aldo", 34));
        list.addPerson(new Person("Khamzat", "Chimaev", 27));
        list.addPerson(new Person("Dustin", "Porier", 33));
        list.addPerson(new Person("Stipe", "Miocic", 33));
        String filename = "MidtermPrep/src/people.dat";
        list.toFile(filename);
        // read what you just wrote to the file
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
            Person p;
            do {
                p = (Person) inputStream.readObject();
                System.out.println(p);
            } while (p != null);
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
