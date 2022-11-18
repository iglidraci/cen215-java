public class FacultyMember extends Employee {
    public static void main(String[] args) {
        new FacultyMember(); // anonymous object

    }

    public FacultyMember() {
        super();
        System.out.println("Performing stuff related to FacultyMember ...");
    }
}

class Employee extends Person {
    public Employee() {
        super(); // unnecessary since Java will invoke it implicitly
        System.out.println("Performing stuff related to Employee ...");
    }
}

class Person {
    public Person() {
        System.out.println("Calling Person's constructor ...");
    }
}
