package exercise.third;

import java.util.Date;

public class Transaction {
    private final Date date;
    private double amount;
    private TransactionType type;
    private String description;
    private final int id = count;
    private static int count = 1;

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Transaction(double amount, TransactionType type, String description) {
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.date = new Date();
        count++;
    }

    public Transaction(double amount, TransactionType type) {
        this(amount, type, "Unknown reason");
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
