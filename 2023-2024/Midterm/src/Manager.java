public class Manager extends Employee {
    private String department;

    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "; Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}