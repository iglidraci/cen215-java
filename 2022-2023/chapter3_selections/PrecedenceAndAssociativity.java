import java.lang.System;
import java.util.Scanner;

public class PrecedenceAndAssociativity {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 || x < 10 && y < 0) {
            System.out.println("First if");
        }
        if (x > 0 || (x < 10 && y < 0)) {
            System.out.println("Second if");
        }
        int a, b, c, d;
        b = 1;
        d = 2;
        a = b += c = ++d;
        System.out.println("a = " + ++a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
