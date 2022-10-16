import java.util.Random;

public class TestMyInteger {
    public static void main(String[] args) {
        var random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int nr;
            do {
                nr = random.nextInt(10000);
            } while (!MyInteger.isPrime(nr));
            numbers[i] = nr;
        }
        System.out.print("Number\tIsOdd\tIsEven\tIsPrime\n");
        for(int i: numbers)
            System.out.printf("%d\t%b\t%b\t%b\n", i, MyInteger.isOdd(i), MyInteger.isEven(i),
                    MyInteger.isPrime(i));
        assert MyInteger.parseInt("123") == 123;
        assert MyInteger.parseInt(new char[] {'1', '2', '2'}) == 122;
        assert MyInteger.isPrime(13);
        assert !MyInteger.isPrime(9);
    }
}
