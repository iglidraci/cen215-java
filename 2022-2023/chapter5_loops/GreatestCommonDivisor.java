import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        i = scanner.nextInt();
        j = scanner.nextInt();
        int gcd = 1;
        for (int k = 2; k <= i && k <= j ; k++) {
            if (i % k == 0 && j % k == 0)
                gcd = k;
        }
        System.out.printf("GCD between %d and %d = %d\n", i, j, gcd);
    }
}
