public class DynamicBindingDemo {
    public static void main(String[] args) {
        foo(new Graduate());
        foo(new Student());
        foo(new Person());
        foo(new Object());
        new Bird().printBird();
        new Penguin().printBird();
        new A();
        new B();
    }

    public static void foo(Object x) {
        System.out.println(x);
    }
}

class Graduate extends Student {}

class Student extends Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Person {
    @Override
    public String toString() {
        return "Person";
    }
}

class Penguin extends Bird {
    private String getInfo() {
        return "Flightless bird";
    }
}

class Bird {
    public void printBird() {
        System.out.println(getInfo());
    }

    private String getInfo() {
        return "Just a bird";
    }
}

class A {
    int i = 7;
    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        System.out.println("i from B is " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}