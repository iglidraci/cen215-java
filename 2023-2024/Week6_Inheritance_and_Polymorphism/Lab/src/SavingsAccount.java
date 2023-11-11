import java.util.Date;

public class SavingsAccount extends Account{

    private Date withdrawFromDate;
    public SavingsAccount(String id, String name, double balance) {
        super(id, name, balance);
        this.withdrawFromDate = new Date(getDateCreated().getTime() + (1000*60*2)); // 2 minutes from dateCreated
    }

    public SavingsAccount(String id, String name) {
        super(id, name);
    }

    public Date getWithdrawFromDate() {
        return withdrawFromDate;
    }

    @Override
    public boolean withdraw(double amount) {
        Date currentDate = new Date();
        if(currentDate.getTime() < this.withdrawFromDate.getTime()) {
            System.out.println("Cannot withdraw from savings account until " + this.withdrawFromDate);
            return false;
        }
        return super.withdraw(amount);
    }
}
