public class DynamicBinding {
    public static void main(String[] args) {
        printSth(new Person());
        printSth(new Student());
        printSth(new BachelorStudent());
        // casting objects
        Person p1 = new Student(); // implicit casting (up-casting)
        Student s1 = (Student) p1; // explicit casting (down-casting)
        // If the superclass object is not an instance of the subclass, a runtime ClassCastException occurs
        // to make sure it is use instanceof operator
        if (p1 instanceof Student)
            ((Student) p1).register();
    }

    public static void printSth(Object obj) {
        System.out.println(obj.toString());
    }
}

class Person {
    @Override
    public String toString() {
        return "Person";
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
    public void register() {
        System.out.println("I registered");
    }
}

class BachelorStudent extends Student {
    @Override
    public String toString() {
        return "Bachelor Student";
    }
}

