public class PrimeNumberMethod {
    public static void main(String[] args) {
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int primeNumbers) {
        
        final int PRIME_PER_LINE = 10;
        int count = 0; // number of primes
        int number = 2; // a number to be tested for primeness
        System.out.println("The first " + primeNumbers + " prime numbers are:");
        while (count < primeNumbers) {
            if(isPrime(number)) {
                count++;
                if (count % PRIME_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + "\t");
            }
            number++; // check the next number
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for(int i=2; i <= number/2; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
