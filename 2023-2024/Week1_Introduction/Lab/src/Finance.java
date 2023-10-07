import java.util.Scanner;

public class Finance {
    public static void main(String[] args) {
        double amount, annualRate;
        int maturity;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount:");
        amount = scanner.nextDouble();
        System.out.println("Enter the annual rate");
        annualRate = scanner.nextDouble();
        System.out.println("Enter the number of months");
        maturity = scanner.nextInt();
        System.out.println("CD\t\tCD Value");
        for (int i = 1; i <= maturity; i++) {
            amount += amount * annualRate / 1200;
            System.out.printf("%d\t\t%.2f\n", i, amount);
        }
    }
}
