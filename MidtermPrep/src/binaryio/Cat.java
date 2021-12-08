package binaryio;

import java.io.Serializable;

public class Cat implements Serializable {
    // To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted
    // into a copy of the object
    // Deserialization is the process of converting the serialized form of an object back into a copy of the object
    private String breed;
    private transient String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
