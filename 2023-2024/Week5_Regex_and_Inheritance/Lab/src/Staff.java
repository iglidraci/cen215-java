import java.util.Date;

public class Staff extends Employee{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office,
                 double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public Staff() {
    }

    public String toString() {
        return "Staff " + super.getName();
    }
}
