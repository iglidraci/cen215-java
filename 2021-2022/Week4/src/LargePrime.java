import java.math.BigInteger;

public class LargePrime {
    public static void main(String[] args) {
        BigInteger[] largePrimes = new BigInteger[5];
        int i = 0;
        BigInteger bigInteger = new BigInteger(String.valueOf(Long.MAX_VALUE)).add(new BigInteger("1"));
        while (i < largePrimes.length) {
            if (isPrime(bigInteger))
                largePrimes[i++] = bigInteger;
            bigInteger = bigInteger.add(new BigInteger("1"));
        }
        for(BigInteger bigPrime: largePrimes)
            System.out.println(bigPrime);
    }

    private static boolean isPrime(BigInteger n) {
        return n.isProbablePrime(50);
    }
}
