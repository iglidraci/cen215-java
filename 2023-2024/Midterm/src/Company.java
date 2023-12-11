public class Company {
    private int index = 0;
    private Employee[] employees;
    private static final int DEFAULT_CAPACITY = 50;

    public Company() {
        this(DEFAULT_CAPACITY);
    }
    public Company(int capacity) {
        employees = new Employee[capacity];
    }
    public void addEmployee(Employee e) {
        if(index == employees.length) {
            resize();
        }
        employees[index++] = e;
    }
    private void resize() {
        Employee[] temp = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
    }
    public Employee getFirstEmployeeOrDefault(String name) {
        for (int i = 0; i < index; i++) {
            if(employees[i].getName().toLowerCase().contains(name.toLowerCase()))
                return employees[i];
        }
        return null;
    }

    public Manager selectManagerOfMaxSalary() {
        Manager highestPaid = null;
        for (int i = 0; i < index; i++) {
            if(employees[i] instanceof Manager) {
                Manager manager = (Manager) employees[i];
                if(highestPaid == null)
                    highestPaid = manager;
                else if (Double.compare(manager.getSalary(), highestPaid.getSalary()) > 0) {
                    highestPaid = manager;
                }
            }
        }
        if(highestPaid == null) throw new RuntimeException("No manager to select");
        return highestPaid;
    }
}
