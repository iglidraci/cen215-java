public class FacultyMember extends Employee {
    public static void main(String[] args) {
        new FacultyMember(); // anonymous object

    }

    public FacultyMember() {
        System.out.println("Performing stuff related to FacultyMember ...");
    }
}

class Employee extends Person {
    public Employee() {
        super(); // unnecessary since Java will invoke it implicitly
        System.out.println("Performing stuff related to Employee ...");
        super.sayHello();
    }
}

class Person {
    public Person() {
        System.out.println("Calling Person's constructor ...");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
}
