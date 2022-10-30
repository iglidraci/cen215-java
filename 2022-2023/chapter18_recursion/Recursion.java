import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nr = scanner.nextInt();
        System.out.println("Factorial of " + nr + " is " + findFactorial(nr));
        System.out.println("Fibonacci of " + nr + " is " + badFibonacci(nr));
        System.out.println(fibTL(nr));
    }
    public static long findFactorial(int nr) {
        if (nr == 0)
            return 1;
        return nr * findFactorial(nr - 1);
    }

    /*Finding the i-th Fibonacci number in the series*/
    public static long badFibonacci(int i) {
        if (i == 0) return 0;
        else if (i == 1) return 1;
        else return badFibonacci(i - 1) + badFibonacci(i - 2);
    }

    public static long fibTL(int nr) {
        // tail-recursion optimization
        return fibTL(nr, 0, 1);
    }
    public static long fibTL (int nr, long a, long b) {
        if (nr == 0)
            return a;
        else if (nr == 1)
            return b;
        else return fibTL(nr-1, b, a+b);
    }
}
