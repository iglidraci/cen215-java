import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        final int SIZE = 100;
        Random r = new Random();
        int[] nr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            nr[i] = r.nextInt();
        }
        sort(nr);
    }
    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}
