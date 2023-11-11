import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    enum UserState {ON_MENU, LOGGED_IN, REGISTERING}
    private static final Scanner scanner = new Scanner(System.in);
    private static UserState userState = UserState.ON_MENU;

    private static final int REGISTER = 1;
    private static final int LOG_IN = 2;

    private static final int CHECK_BALANCE = 1;
    private static final int WITHDRAW = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
    private static final int OVERDRAFT = 5;

    private static final int SIMPLE_ACCOUNT = 1;
    private static final int SAVINGS_ACCOUNT = 2;
    private static final int CHECKING_ACCOUNT = 3;

    private static final ArrayList<Account> accounts;
    private static Account currentAccount;

    static {
        Account acc1 = new Account("0001", "Foo", 1000);
        Account acc2 = new SavingsAccount("0002", "Bar", 2000);
        Account acc3 = new CheckingAccount("0003", "Baz", 3000);
        accounts = new ArrayList<>(Arrays.asList(acc1, acc2, acc3));
    }
    public static void main(String[] args) {
        String idInput;
        int menuChoice;
        while (true) {
            do {
                int homeScreenChoice = getHomeScreenChoice();
                if(homeScreenChoice == REGISTER)
                    userState = UserState.REGISTERING;
                else if (homeScreenChoice == LOG_IN) {
                    do {
                        System.out.println("Enter your id: ");
                        idInput = scanner.nextLine();
                        if((currentAccount = getAccount(idInput)) != null)
                            userState = UserState.LOGGED_IN;
                        else
                            System.out.println("ID doesn't exist");
                    } while (userState != UserState.LOGGED_IN);
                }
            } while (userState == UserState.ON_MENU);
            if(userState == UserState.REGISTERING) {
                registerAccount();
            } else if(userState == UserState.LOGGED_IN) {
                do {
                    menuChoice = getUserMenuChoice();
                    switch (menuChoice) {
                        case CHECK_BALANCE:
                            System.out.println("Balance is " + currentAccount.getBalance());
                            break;
                        case WITHDRAW:
                            withdrawFromAccount();
                            break;
                        case DEPOSIT:
                            depositToAccount();
                            break;
                        case OVERDRAFT:
                            setOverdraft();
                            break;
                        case EXIT:
                            System.out.println("Exiting from account with id " + currentAccount.getId());
                            currentAccount = null;
                            userState = UserState.ON_MENU;
                            break;
                        default:
                            System.out.println("Invalid command");
                    }
                } while (menuChoice != EXIT);
            }

        }
    }

    private static void setOverdraft() {
        if(currentAccount instanceof CheckingAccount) {
            System.out.println("Enter overdraft value:");
            double overdraft = Double.parseDouble(scanner.nextLine());
            ((CheckingAccount)currentAccount).setOverdraft(overdraft);
            System.out.println("Overdraft " + overdraft + " set successfully");
        }
    }

    private static void registerAccount() {
        int accountType = getAccountType();
        String id, name;
        double amount;
        while (true){
            System.out.println("Enter your id:");
            id = scanner.nextLine();
            if(idExists(id)) {
                System.out.println(id + " already exists, enter a new one");
            } else break;
        }
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter initial amount: ");
        amount = Double.parseDouble(scanner.nextLine());
        if(accountType == SIMPLE_ACCOUNT) {
            accounts.add(new Account(id, name, amount));
        } else if (accountType == SAVINGS_ACCOUNT) {
            accounts.add(new SavingsAccount(id, name, amount));
        } else if (accountType == CHECKING_ACCOUNT) {
            double overdraft;
            System.out.print("Enter overdraft: ");
            overdraft = Double.parseDouble(scanner.nextLine());
            accounts.add(new CheckingAccount(id, name, amount, overdraft));
        }
    }

    private static boolean idExists(String id) {
        for(Account a : accounts)
            if(a.getId().equals(id))
                return true;
        return false;
    }

    private static int getAccountType() {
        int type;
        do {
            System.out.println("Enter the account type");
            System.out.println("1. Simple account");
            System.out.println("2. Savings account");
            System.out.println("3. Checking account");
            System.out.println("Enter a choice:");
            type = Integer.parseInt(scanner.nextLine());
        } while (type < 1 || type > 3);
        return type;
    }

    private static Account getAccount(String idInput) {
        Account acc = null;
        for(Account account : accounts) {
            if(account.getId().equals(idInput)) {
                acc = account;
                break;
            }
        }
        return acc;
    }


    private static int getHomeScreenChoice() {
        System.out.println("Home Menu");
        System.out.println("1. Register");
        System.out.println("2. Authenticate");
        System.out.println("Enter a choice: ");
        return Integer.parseInt(scanner.nextLine());

    }

    private static void depositToAccount() {
        double movement;
        System.out.print("Enter an amount to deposit: ");
        movement = Double.parseDouble(scanner.nextLine());
        boolean deposited = currentAccount.deposit(movement);
        if(deposited)
            System.out.println(movement + " were deposited successfully");
        else
            System.out.println("Couldn't deposit " + movement);
    }

    private static void withdrawFromAccount() {
        double movement;
        System.out.print("Enter an amount to withdraw: ");
        movement = Double.parseDouble(scanner.nextLine());
        boolean withdrew = currentAccount.withdraw(movement);
        if(withdrew)
            System.out.println(movement + " were withdrawn successfully");
        else
            System.out.println("Couldn't withdraw " + movement);
    }

    private static int getUserMenuChoice() {
        System.out.println("Main menu");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        if(currentAccount instanceof CheckingAccount) {
            System.out.println("5. Set overdraft");
        }
        System.out.println("Enter a choice:");
        return Integer.parseInt(scanner.nextLine());
    }
}
