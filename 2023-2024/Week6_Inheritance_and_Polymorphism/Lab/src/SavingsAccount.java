public class SavingsAccount extends Account{
    public SavingsAccount(String id, String name, double balance) {
        super(id, name, balance);
    }

    public SavingsAccount(String id, String name) {
        super(id, name);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from savings account");
    }
}
