package groupA;

public class Teacher extends Person{
    private int yearOfEmployment;

    public Teacher(String name, String surname, String specialty, int yearOfEmployment) {
        super(name, surname, specialty);
        this.yearOfEmployment = yearOfEmployment;
    }

    public Teacher() {
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}
