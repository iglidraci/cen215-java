import java.util.Scanner;

public class ATMMachine {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int nrAccounts = 10;
        Account[] accounts = new Account[nrAccounts];
        for (int i = 0; i < nrAccounts; i++)
            accounts[i] = new Account(i, 100);
        int idInput;
        int menuChoice;
        while (true) {
            do {
                System.out.print("Enter an id between 0 and 9: ");
                idInput = scanner.nextInt();
            } while (idInput<0 || idInput >9);
            System.out.println();
            do {
                menuChoice = getMenuChoice();
                switch (menuChoice) {
                    case 1:
                        System.out.println("Balance is " + accounts[idInput].getBalance());
                        break;
                    case 2:
                        withdrawFromAccount(accounts[idInput]);
                        break;
                    case 3:
                        depositToAccount(accounts[idInput]);
                        break;
                    case 4:
                        System.out.println("Exiting from account with id " + idInput);
                        break;
                    default:
                        System.out.println("Invalid command");
                }
            } while (menuChoice != 4);
        }
    }

    private static void depositToAccount(Account accounts) {
        double movement;
        System.out.print("Enter an amount to deposit: ");
        movement = scanner.nextDouble();
        boolean deposited = accounts.deposit(movement);
        if(deposited)
            System.out.println(movement + " were deposited successfully");
        else
            System.out.println("Couldn't deposit " + movement);
    }

    private static void withdrawFromAccount(Account accounts) {
        double movement;
        System.out.print("Enter an amount to withdraw: ");
        movement = scanner.nextDouble();
        boolean withdrew = accounts.withdraw(movement);
        if(withdrew)
            System.out.println(movement + " were withdrawn successfully");
        else
            System.out.println("Couldn't withdraw " + movement);
    }

    private static int getMenuChoice() {
        System.out.println("Main menu");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Enter a choice:");
        return scanner.nextInt();
    }
}
