import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EURO = 123, DOLLAR = 110, POUNDS = 148.6, YEN = 1.02, CHF = 111.6;
        double lek;
        System.out.println("Please enter the amount of LEK you want to convert: ");
        lek = scanner.nextDouble();
        System.out.println("Please choose one of the numbers below to select currency you want your LEK to be converted :\n" +
                "Press 1 for Euro (1 Euro = 123 L)\n" +
                "Press 2 for Dollar ( 1 Dollar = 110 L)\n" +
                "Press 3 for Pounds (1 Pound = 148.6 L)\n" +
                "Press 4 for Yen (1 Yen = 1.02 L)\n" +
                "Pres 5 for Swiss Franc (1 Franc = 111.6 L)");
        int exchange = scanner.nextInt();
        switch (exchange) {
            case 1:
                System.out.printf("%.2f Lek -> %.2f Euro", lek, lek / EURO);
                break;
            case 2:
                System.out.printf("%.2f Lek -> %.2f Dollar", lek, lek / DOLLAR);
                break;
            case 3:
                System.out.printf("%.2f Lek -> %.2f Pound", lek, lek / POUNDS);
                break;
            case 4:
                System.out.printf("%.2f Lek -> %.2f Yen", lek, lek / YEN);
                break;
            case 5:
                System.out.printf("%.2f Lek -> %.2f Swiss Franc", lek, lek / CHF);
                break;
            default:
                System.out.println("Wrong conversion currency");
        }
    }
}
