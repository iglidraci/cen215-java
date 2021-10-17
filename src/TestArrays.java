import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class TestArrays {
    private final HashMap<Integer, Long> cache = new HashMap<>();
    public TestArrays() {

    }
    public int factorial(int number) {
     if (number == 1 || number == 0)
         return 1;
     else return number * factorial(number-1);
    }
    public long fib(int number) {
        if (number <= 2) {
            return number;
        } else {
            if (cache.containsKey(number))
                return cache.get(number);
            var res = fib(number - 1) + fib(number - 2);
            cache.put(number, res);
            return res;
        }
    }
    public double average (double...numbers) {
        return Arrays.stream(numbers).sum() / numbers.length;
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(java.util.Arrays.binarySearch(a, 79));
        double[] numbers = {1., 2., 5. , 2., 6. , 1.};
        int [][] matrix = {{1, 2, 3}, {2, 3, 4, 5}, {2}};
        Arrays.sort(numbers);
        for (double i: numbers)
            System.out.println(i);
        TestArrays obj = new TestArrays();
//        System.out.println(obj.factorial(2));
        System.out.println(obj.fib(100));
        var sum = 0;
        System.out.println("Sum of args ");
        for (String arg: args) {
            System.out.print(arg + " ");
            sum += Integer.parseInt(arg);
        }
        System.out.println("= " + sum);
        System.out.println(obj.average(2., 3.5, 6.7, 5.8));
        Date date = new Date();
        System.out.println();
    }
}
