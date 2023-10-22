import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        BigInteger result = factorial(scanner.nextLong());
        System.out.println("Factorial: " + result);
    }

    public static BigInteger factorial(long number) {
        BigInteger result = new BigInteger("1");
        // or alternatively BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }
}
