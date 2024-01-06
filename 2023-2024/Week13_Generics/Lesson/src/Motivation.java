import java.util.ArrayList;
import java.util.Date;

public class Motivation {
    public static void main(String[] args) {
        // The motivation for using Java generics is to detect errors at compile time.
        Comparable c = new Date();
        System.out.println(c.compareTo("hello")); // compiles fine but runtime error

        Comparable<Date> d = new Date();
        // System.out.println(d.compareTo("hello")); // compile error
        // generic types must be reference types
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        int a = integers.get(0); // auto-unboxing
    }
}
