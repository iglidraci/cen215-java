public class PrimeNumbers {
    public static void main(String[] args) {
        final int PRIME_NUMBERS = 50;
        final int PRIME_PER_LINE = 10;
        int count = 0; // number of primes
        int number = 2; // a number to be tested for primeness
        System.out.println("The first " + PRIME_NUMBERS + " prime numbers are:");
        while (count < PRIME_NUMBERS) {
            boolean isPrime = true;
            for(int i=2; i <= number/2; i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                if (count % PRIME_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + "\t");
            }
            number++; // check the next number
        }
    }
}
