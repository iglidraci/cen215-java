import java.util.Date;

public class Motivation {
    public static void main(String[] args) {
        // The motivation for using Java generics is to detect errors at compile time.
        Comparable c = new Date();
        System.out.println(c.compareTo("hello")); // compiles fine but runtime error

        Comparable<Date> d = new Date();
//        System.out.println(d.compareTo("hello")); // compile error
    }
}
