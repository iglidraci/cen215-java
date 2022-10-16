import java.util.Scanner;

public class ATMGame {
    public static void main(String[] args) {
        final int nrAccounts = 10;
        Account[] accounts = new Account[nrAccounts];
        for (int i = 0; i < nrAccounts; i++)
            accounts[i] = new Account(i, 100, 0);
        int idInput;
        int menuChoice;
        double movement;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            do {
                System.out.print("Enter an id:");
                idInput = scanner.nextInt();
            } while (idInput<0 || idInput >=10);
            System.out.println();
            do {
                System.out.println("Main menu");
                System.out.println("1. Check balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter a choice:");
                menuChoice = scanner.nextInt();
                switch (menuChoice) {
                    case 1 -> System.out.println("Balance is " + accounts[idInput].getBalance());
                    case 2 -> {
                        System.out.print("Enter an amount to withdraw: ");
                        movement = scanner.nextDouble();
                        accounts[idInput].withdraw(movement);
                    }
                    case 3 -> {
                        System.out.print("Enter an amount to deposit: ");
                        movement = scanner.nextDouble();
                        accounts[idInput].deposit(movement);
                    }
                    case 4 -> System.out.println("Exit from account with id " + idInput);
                    default -> System.out.println("Invalid command");
                }
            } while (menuChoice != 4);
        }
    }
}
