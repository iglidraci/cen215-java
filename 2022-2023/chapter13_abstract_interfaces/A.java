public interface A {
    /*
    * A default method provides a default implementation for the method in the interface.
    * A class that implements the interface may simply use the default implementation for
    * the method or override the method with a new implementation.
    * */
    public default void doSomething() {
        System.out.println("doing something");
    }

    /*
    * Java 8 also permits public static methods in an interface.
    * A public static method in an interface can be used just like a public static method in a class.
    * */
    public static int getAValue() {
        return 0;
    }
}
