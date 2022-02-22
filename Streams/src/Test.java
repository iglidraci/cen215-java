import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers = {23, 15, 10, 11, 14, 15, 16, 17};
        String[] binaries = {"110011", "110000", "1100110011"};
        long cnt = Stream.of(numbers).filter(x -> x % 2 == 0).count();
        System.out.println("Even numbers are " + cnt);
        int[] sqrt = Stream.of(numbers).mapToInt(x -> x*x).toArray();
        long sum = Stream.of(numbers).reduce((x, y) -> x + y).get();
        long sumOfCubes = Stream.of(numbers)
                .mapToLong(x -> x * x * x)
                .reduce((x, y) -> x + y).getAsLong();
        System.out.println(Arrays.toString(sqrt));
        System.out.println("Sum is " + sum);
        System.out.println("Sum of cubes is " + sumOfCubes);
        boolean allPositive = Stream.of(numbers).allMatch(x -> x > 0);
        // method reference
        boolean anyPrime = Stream.of(numbers).anyMatch(MyMath::isPrime);
        System.out.println(allPositive ? "All positive" : "Not all positive");
        System.out.println(anyPrime ? "There is at least a prime number" : "No prime numbers");
        System.out.println(Arrays.toString(Stream.of(binaries).mapToInt(x -> {
            try {
                return NumberConverter.bin2Dec(x);
            } catch (BinaryFormatException e) {
                e.printStackTrace();
            }
            return 0;
        }).toArray()));
        int max = Stream.of(numbers).max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max number is " + max);
        Stream.of(numbers).sorted().forEach(System.out::println);
        System.out.println("Sorted distinct numbers are: " + Arrays.toString(Stream.of(numbers).distinct().sorted().toArray()));
        //we use Optional because we might not find any prime numbers
        Optional<Integer> firstPrime = Stream.of(numbers).filter(MyMath::isPrime).findFirst();
        if (firstPrime.isPresent())
            System.out.println("First prime number is " + firstPrime.get());
        else
            System.out.println("No prime numbers found!");
        IntSummaryStatistics statistics = IntStream.of(1, 2, 3, 10, 11, 2, 3, 4).summaryStatistics();
        System.out.println("Avg: " + statistics.getAverage());
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Min: " + statistics.getMin());
        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Count: " + statistics.getCount());
    }
}

class MyMath {
    public static boolean isPrime (int nr) {
        // method implementation doesn't matter
        return false;
    }
}