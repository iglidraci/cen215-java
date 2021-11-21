import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Month[] months = new Month[12];
        YearMonth yearMonth;
        for (int i = 0; i < months.length; i++) {
            yearMonth = YearMonth.of(2021, i+1);
            months[i] = new Month(yearMonth.getMonth().name(), yearMonth.lengthOfMonth());
        }
        Scanner scanner = new Scanner(System.in);
        int monthInput;
        boolean wrongInput;
        do {
            try{
                System.out.println("Enter month number:");
                monthInput = scanner.nextInt();
                System.out.println(months[monthInput-1].name() + " has " + months[monthInput-1].days() + " days");
                wrongInput = false;
            } catch (InputMismatchException mismatchException) {
                // consume next() otherwise it will run forever because of InputMismatchException
                scanner.next();
                System.out.println("Enter a number please!");
                wrongInput = true;
            } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
                System.out.println("Enter a number between 1 and 12");
                wrongInput = true;
            }
        } while (wrongInput);
    }
}

record Month(String name, int days) {
}
