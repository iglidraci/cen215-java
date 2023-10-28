import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate; // since all accounts have the same annual interest rate
    private Date dateCreated;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance >= 0 ? balance : 0;
    }

    public static double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        // only between 0 and 1
        if (annualInterestRate >= 0 && annualInterestRate <= 1)
            Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public Account() {
        this(0, 0);
    }

    public double getMonthlyInterestRate() {
        return Account.annualInterestRate/12;
    }
    public double getMonthlyInterest() {
        return this.balance*getMonthlyInterestRate();
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

}