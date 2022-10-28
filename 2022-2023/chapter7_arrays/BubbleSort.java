public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 10};
        System.out.print("Before bubble sort: ");
        ArrayBasics.printArray(numbers);
        bubbleSort(numbers);
        System.out.print("After bubble sort: ");
        ArrayBasics.printArray(numbers);
    }

    private static void bubbleSort(int[] numbers) {
        // at least two optimizations
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
