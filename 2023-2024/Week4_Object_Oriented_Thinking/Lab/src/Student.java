public class Student {
    private String firstName, lastName;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName= firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("%-15s %-15s", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}