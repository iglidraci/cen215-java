public class CheckingAccount extends Account{

    private double overdraft;

    public CheckingAccount(String id, String name, double balance, double overdraft) {
        super(id, name, balance);
        this.overdraft = overdraft;
    }

    public CheckingAccount(String id, String name, double overdraft) {
        super(id, name);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft > 0 ? overdraft : this.overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && getBalance() - amount >= overdraft)
            super.withdraw(amount);
        else
            System.out.println("Transaction failed because of your overdraft limit");
    }
}
