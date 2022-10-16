import java.util.Random;
import java.util.stream.LongStream;

public class TestParallel {
    public static void main(String[] args) {
        int total = 200_000_000;
        System.out.println("Total numbers to process is " + total);
        System.out.println("Available processors are: " + Runtime.getRuntime().availableProcessors());
        Random random = new Random();
        long[] numbers = random.longs(total).toArray();
        System.out.println("Array of random numbers created");
        long startTime, endTime, count;
        startTime = System.currentTimeMillis();
        count = LongStream.of(numbers).filter(x -> x > 0).count();
        endTime = System.currentTimeMillis();
        System.out.println("Sequential stream took " + (endTime - startTime) + " milliseconds to find count = " + count);
        startTime = System.currentTimeMillis();
        count = LongStream.of(numbers).parallel().filter(x -> x > 0).count();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel stream took " + (endTime - startTime) + " milliseconds to find count = " + count);
    }
}
