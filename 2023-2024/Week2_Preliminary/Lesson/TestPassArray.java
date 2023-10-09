public class TestPassArray {
    public static void main(String[] args) {
        int[] list = {1, 2};
        // swap elements using the first method
        System.out.print("Before calling swap: ");
        ArrayBasics.printArray(list);
        swap(list[0], list[1]);
        System.out.print("After calling swap: ");
        ArrayBasics.printArray(list);
        // swap elements using the second method
        System.out.print("Before calling swapFirstTwoElements: ");
        ArrayBasics.printArray(list);
        swapFirstTwoElements(list);
        System.out.print("After calling swapFirstTwoElements: ");
        ArrayBasics.printArray(list);
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = n1;
    }

    public static void swapFirstTwoElements(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
