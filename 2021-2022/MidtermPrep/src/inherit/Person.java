package inherit;

public class Person {
    private String name;
    private String surname;
    private String specialty;

    public Person(String name, String surname, String specialty) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
