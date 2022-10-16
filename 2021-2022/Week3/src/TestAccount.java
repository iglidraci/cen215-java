import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(112, 20000, 0.045);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Current balance: " + account.getBalance());
        System.out.println("Monthly interest: " + account.getMonthlyInterest());
        System.out.println("Created on: " + account.getDateCreated());
        var dateCreated = account.getDateCreated();
        System.out.println(dateCreated);
        dateCreated.setTime(200000);
        System.out.println(dateCreated);
        System.out.println(account.getDateCreated());
    }
}
