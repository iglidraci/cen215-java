import java.math.BigInteger;
import java.util.Arrays;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largePrimeNumbers(5)));
    }

    public static BigInteger[] largePrimeNumbers(int total) {
        BigInteger[] largePrimes = new BigInteger[total];
        int i = 0;
        BigInteger current = new BigInteger(String.valueOf(Long.MAX_VALUE)).add(BigInteger.ONE);
        while (i < largePrimes.length) {
            if (current.isProbablePrime(50))
                largePrimes[i++] = current;
            current = current.add(BigInteger.ONE);
        }
        return largePrimes;
    }
}
