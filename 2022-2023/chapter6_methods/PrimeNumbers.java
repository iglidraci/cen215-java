public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Total prime numbers 100");
        printPrimeNumbers(100, 10);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }

    public static void printPrimeNumbers(int numberOfPrimes, int primesPerLine) {
        int number = 2; // number from where to start testing
        int found = 0;  // prime numbers found
        while (found < numberOfPrimes) {
            if (isPrime(number)) {
                found++;
                if (found % primesPerLine == 0)
                    System.out.printf("%-5d\n", number);
                else
                    System.out.printf("%-5d", number);
            }
            number++;
        }
    }
}
