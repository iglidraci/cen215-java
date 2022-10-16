package person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class PersonList {
    private Person[] people;
    int nrPeople;
    public PersonList() {
        this(500);
    }
    public PersonList(int size) {
        people = new Person[size];
        nrPeople = 0;
    }
    public void addPerson(Person person) {
        if (nrPeople == people.length) {
            // no more space so resize the array
            Person[] temp = new Person[people.length * 2];
            System.arraycopy(people, 0, temp, 0, nrPeople);
            people = temp;
        }
        people[nrPeople++] = person;
    }
    private Person getPersonAtIndex(int index) {
        if (nrPeople > index)
            return people[index];
        else return null;
    }
    public Person getFirst() {
        return getPersonAtIndex(0);
    }
    public Person getLast() {
        return getPersonAtIndex(nrPeople-1);
    }
    public Person getOldest() {
        if (nrPeople == 0)
            return null;
        Person oldest = people[0];
        for (int i = 1; i < nrPeople; i++) {
            if (people[i].getAge() > oldest.getAge())
                oldest = people[i];
        }
        printPerson(oldest);
        return oldest;
    }

    public Person[] getPeople() {
        return Arrays.copyOfRange(people, 0, nrPeople);
    }

    private void printPerson(Person oldest) {
        System.out.println(oldest);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Person p: getPeople())
            stringBuilder.append(p.toString()).append('\n');
        return stringBuilder.toString();
    }
    public void toFile(String filename) {
        System.out.println("Open the file");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            for(Person p: getPeople())
                outputStream.writeObject(p);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Close the file");
    }
}
