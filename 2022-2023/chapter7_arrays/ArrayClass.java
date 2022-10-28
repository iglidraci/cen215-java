import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 1, 2, 3};
        Arrays.sort(numbers); // sorting arrays
        System.out.println("After Arrays.sort call: ");
        ArrayBasics.printArray(numbers);
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Index is " + Arrays.binarySearch(list, 11)); // searching
        System.out.println("Index is " + Arrays.binarySearch(list, 100));
        // comparing arrays
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(list1 == list2);
        System.out.println(Arrays.equals(list1, list2));
        System.out.println(Arrays.equals(list2, list3));
        // print array
        System.out.println(Arrays.toString(list1));
    }
}
