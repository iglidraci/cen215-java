package exercise.third;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private String id;
    private double balance;
    private double annualInterestRate;
    private final ArrayList<Transaction> transactions;
    private final Date dateCreated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance >= 0 ? balance : 0;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        // only between 0 and 1
        if (annualInterestRate >= 0 && annualInterestRate <= 1)
            this.annualInterestRate = annualInterestRate;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate/12;
    }
    public double getMonthlyInterest() {
        return this.balance*getMonthlyInterestRate();
    }

    public Account(String id, String name, double balance) {
        this.name = name;
        this.id = id;
        setBalance(balance);
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }
    public Account(String id) {
        this(id, "Unknown", 0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT);
            transactions.add(transaction);
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            Transaction transaction = new Transaction(amount, TransactionType.WITHDRAWAL);
            transactions.add(transaction);
            balance -= amount;
        }
    }
    public void printTransactions() {
        System.out.println("Mr/Mrs " + this.name + " here are your transactions");
        for(Transaction transaction: getTransactions())
            System.out.println(transaction);
    }
    public double getInitialBalance() {
        // this method should return the balance of the account when it was created the first time
        return getBalanceFromDate(dateCreated);
    }

    public double getBalanceFromDate(Date fromDate) {
        // this method should return the balance from a specific moment in time
        double returnBalance = getBalance();
        for(Transaction transaction: transactions) {
            if (transaction.getDate().compareTo(fromDate) >= 0) {
                if (transaction.getType() == TransactionType.DEPOSIT)
                    returnBalance -= transaction.getAmount();
                else
                    returnBalance += transaction.getAmount();
            }
        }
        return returnBalance;
    }
    public void makeTransaction(double amount) {
        // this method is going to determine whether we are making deposit or withdraw
        // if negative we must withdraw
        if (amount > 0)
            this.deposit(amount);
        else
            this.withdraw(-amount);
    }
}
