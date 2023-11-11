import java.util.Date;
import java.util.UUID;

public class Transaction {
    private final Date date;
    private final double amount;
    private final TransactionType type;
    private final String description;
    private final String id;

    public Transaction(double amount, TransactionType type, String description) {
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.date = new Date();
        this.id = UUID.randomUUID().toString();
    }

    public Transaction(double amount, TransactionType type) {
        this(amount, type, "Unknown reason");
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
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