import java.util.Arrays;

public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethodDemo.<Integer>print(new Integer[]{1, 2, 3});
        GenericMethodDemo.print(new String[]{"Bar", "Baz"}); // The compiler automatically discovers the actual type
        Integer[] numbers = {1, 10, -1, 20};
        String[] names = {"Foo", "Bar", "Baz"};
        sort(numbers);
        sort(names);
        int[] nrs = {1, 2, 0};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
    }
    // An unbounded generic type
    public static<E> void print(E[] arr) {
        for(E element : arr)
            System.out.println(element);
    }
    // bounded generic type
    public static <E extends Comparable<E>> void sort(E[] data) {
        // selection sort
        // can sort an array of any object type, provided that the objects are also instances of the Comparable interface
        E currentMin;
        int minIndex;
        for (int i = 0; i < data.length - 1; i++) {
            minIndex = i;
            currentMin = data[i];
            for (int j = i + 1; j < data.length; j++) {
                if (data[j].compareTo(currentMin) < 0) {
                    minIndex = j;
                    currentMin = data[j];
                }
            }
            // swap if necessary
            if (i != minIndex) {
                E temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }
}
