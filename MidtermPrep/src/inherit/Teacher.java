package inherit;

public class Teacher extends Person{
    private int yearOfEmployment;

    public Teacher(String name, String surname, String specialty, int yearOfEmployment) {
        super(name, surname, specialty);
        this.yearOfEmployment = yearOfEmployment;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }
}
