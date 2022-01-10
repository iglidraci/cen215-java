package inherit;

public class SchoolSector {
    private Person[] people;
    private int total;
    public SchoolSector(int size) {
        people = new Person[size];
        total = 0;
    }
    public SchoolSector() {
        this(5);
    }
    public void addPerson(Person p) {
        if (p instanceof Teacher && ((Teacher)p).getYearOfEmployment() < 2019)
            return;
        if (total == people.length) {
        }
    }
}
