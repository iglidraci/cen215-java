import java.util.Arrays;
import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        int[] numbers = new int[200000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        stopWatch.start();
        insertionSort(numbers.clone());
        stopWatch.stop();
        System.out.println("Insertion sort took " + stopWatch.getElapsedTimeInSeconds() + " seconds");
        stopWatch.start();
        Arrays.sort(numbers.clone());
        stopWatch.stop();
        System.out.println("Java sort took " + stopWatch.getElapsedTimeInSeconds() + " seconds");
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            int key = array[i];
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
