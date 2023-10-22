import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask for annual interest rate
        System.out.print("Enter the annual interest rate (in percentages): ");
        double annualInterestRate = scanner.nextDouble();
        // ask for number of years
        System.out.print("Enter the number of years (integer): ");
        int numberOfYears = scanner.nextInt();
        // ask for loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        // create loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\n" +
                "The total payment is %.2f\n",
                loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
