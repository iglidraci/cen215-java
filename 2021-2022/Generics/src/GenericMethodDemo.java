public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {4, 1, 2, -1, -2, 0, 10, -4};
        String[] strings = {"hello", "world", "how", "is", "you"};
        print(integers);
        print(strings);
        printNumbersOnly(integers);
        sort(integers);
        sort(strings);
        System.out.println("After sorting");
        print(integers);
        print(strings);
        // can't do this
        // printNumbersOnly(strings);
    }
    // generic method
    public static <T> void print(T[] array) {
        for(T element: array)
            System.out.print(element + " ");
        System.out.println();
    }
    // bounded type
    public static <T extends Number> void printNumbersOnly(T[] numbers) {
        print(numbers);
    }
    // generic bubble sort
    public static <T extends Comparable<T>> void sort (T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
