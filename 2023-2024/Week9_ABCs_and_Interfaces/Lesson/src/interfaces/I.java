package interfaces;

public interface I {
    int K = 1; // same as public static final int K = 1
    void p(); // same as public abstract void p();
    // A default method provides a default implementation for the method in the interface. A class that implements
    // the interface may simply use the default implementation for the method or override the method with a new implementation
    default void doSomething() {
        System.out.println("doing something");
    }
    // A public static method in an interface can be used just like a public static method in a class
    static int getValue() {
        return 1;
    }
}
