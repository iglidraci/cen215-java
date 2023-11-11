import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private String id;
    private double balance;
    private double annualInterestRate;
    private final ArrayList<Transaction> transactions = new ArrayList<>();
    private final Date dateCreated;

    public Account(String id, String name, double balance) {
        this.name = name;
        this.id = id;
        setBalance(balance);
        this.dateCreated = new Date();
    }
    public Account(String id, String name) {
        this(id, name, 0);
    }

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

    public final void setBalance(double balance) {
        this.balance = balance >= 0 ? balance : this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        // only between 0 and 1
        if (annualInterestRate >= 0 && annualInterestRate <= 1)
            this.annualInterestRate = annualInterestRate;
    }

    public Transaction[] getTransactions() {
        Transaction[] array = new Transaction[this.transactions.size()];
        this.transactions.toArray(array);
        return array;
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



    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction(amount, TransactionType.DEPOSIT));
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            transactions.add(new Transaction(amount, TransactionType.WITHDRAWAL));
            balance -= amount;
            return true;
        }
        return false;
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

    public double getBalanceFromDate(Date d) {
        // this method should return the balance from a specific moment in time
        double returnBalance = getBalance();
        for(Transaction transaction: transactions) {
            if (transaction.getDate().compareTo(d) >= 0) {
                if (transaction.getType() == TransactionType.DEPOSIT)
                    returnBalance -= transaction.getAmount();
                else
                    returnBalance += transaction.getAmount();
            }
        }
        return returnBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", dateCreated=" + dateCreated +
                '}';
    }
}