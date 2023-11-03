import java.util.Date;

// office hours and a rank
public class FacultyMember extends Employee {
    private double officeHours;
    private int rank;

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public FacultyMember(){}

    public FacultyMember(String name, String address, String phoneNumber, String email,String office,
                         double salary, Date dateHired, double officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String toString() {
        return "Faculty member " + super.getName();
    }
}
