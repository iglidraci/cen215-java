import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayMonth {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September",
                "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter month: ");
                int month = scanner.nextInt();
                System.out.println(months[month] + " has " + dom[month] + " days");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Month should be between 0 and 11");
            } catch (InputMismatchException ex) {
                System.out.println("Month should be a number");
                scanner.next();
            }
        }
    }
}
