public class RawType {
    public static void main(String[] args) {
        System.out.println(max1("aa", "bb"));
//         System.out.println(max1("aa", 2)); // will compile but runtime error
//         System.out.println(max2("aa", 2)); // compiler error
    }
    public static Comparable max1(Comparable o1, Comparable o2) {
        // raw types, for backward compatibility
        if (o1.compareTo(o2) > 0) return o1;
        else return o2;
    }

    public static <E extends Comparable<E>> E max2(E o1, E o2) {
        if (o1.compareTo(o2) > 0) return o1;
        else return o2;
    }
}