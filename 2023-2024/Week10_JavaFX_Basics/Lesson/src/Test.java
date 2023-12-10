public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.bar();
        obj.foo();
    }
}

class A {
    public static void foo() {
        System.out.println("static method from A");
    }

    public void bar() {
        System.out.println("instance method from A");
    }
}

class B extends A {
    public static void foo() {
        System.out.println("static method from B");
    }

    public void bar() {
        System.out.println("instance method from B");
    }
}