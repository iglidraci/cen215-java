import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();
        try { // if an arithmetic exception occurs
            int result = quotientWithException(nr1, nr2);
            System.out.println(result);
        } catch (ArithmeticException ex) { // ex is the catch block parameter
            System.out.println("An arithmetic exception happened");
        }
        System.out.println("Execution continues");
        /**
         * The key benefit of the of exception handling is separating the detection of an error (done in a called method)
         * from the handling of an error (done in the calling method)
         */
    }

    private static int quotientWithMethod(int nr1, int nr2) {
        /**
         * The problem here is that if nr2 is 0, then we terminate the program
         * Which is awful, the caller of the method should decide whether to terminate or not
         */
        if (nr2 == 0) {
            System.out.println("Cannot divide by zero");
            System.exit(1);
        }
        return nr1/nr2;
    }

    private static int quotientWithException(int nr1, int nr2) {
        if (nr2 == 0)
            throw new ArithmeticException("Divisor cannot be zero"); // throwing an exception
        return nr1/nr2;
    }

}
