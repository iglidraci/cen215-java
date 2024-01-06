public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo.<Integer>print(new Integer[]{1, 2, 3});
        GenericMethodDemo.print(new String[]{"Bar", "Baz"}); // The compiler automatically discovers the actual type
    }
    // An unbounded generic type
    public static<E> void print(E[] arr) {
        for(E element : arr)
            System.out.println(element);
    }
}
