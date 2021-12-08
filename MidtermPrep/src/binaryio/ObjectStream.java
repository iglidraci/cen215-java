package binaryio;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Caracal", "Gosha"),
                new Cat("Serval", "Sogga"),
                new Cat("Bengal", "Gato")
        };
        // let's save cats into a file
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("cats.dat"));
            for(Cat cat: cats)
                outputStream.writeObject(cat);
            outputStream.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        // let's read the file again
        Cat[] newCats = new Cat[cats.length];
        int i = 0;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cats.dat"));
            Cat tempCat;
            do {
                tempCat = (Cat) inputStream.readObject();
                newCats[i++] = tempCat;
            } while (tempCat != null);
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        for (int j = 0; j < cats.length; j++) {
            System.out.println("Cat from original array: " + cats[j]);
            System.out.println("Cat from new array: " + newCats[j]);
            System.out.println("Equal? " + (cats[j] == newCats[j]));
        }
    }
}
