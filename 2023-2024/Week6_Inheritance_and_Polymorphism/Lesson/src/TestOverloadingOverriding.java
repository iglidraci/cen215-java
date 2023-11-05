public class TestOverloadingOverriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.foo(10.5);
        c.bar(10.5);
    }
}

class Parent {
    public void foo(double i) {
        System.out.println(i * 2);
    }

    public void bar(double i) {
        System.out.println(i * 2);
    }
}

class Child extends Parent {
    public void foo(double i) {
        System.out.println(i);
    }

    public void bar(int i) {
        System.out.println(i);
    }
}

class Animal {
    public String toString() {
        return "Animal";
    }
}

class Tiger extends Animal {
    @Override
    public String toString() {
        return super.toString() + " Tiger";
    }
}
