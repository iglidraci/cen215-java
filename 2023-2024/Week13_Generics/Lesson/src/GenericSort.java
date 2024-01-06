import java.util.Arrays;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] numbers = {1, 10, -1, 20};
        String[] names = {"Foo", "Bar", "Baz"};
        sort(numbers);
        sort(names);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
    }
    // A generic type can be specified as a subtype of another type, this is called bounded generic type
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
