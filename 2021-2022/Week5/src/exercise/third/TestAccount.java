package exercise.third;

import java.util.UUID;

public class TestAccount {
    public static void main(String[] args) {
        double initialBalance = 1000.;
        String id = UUID.randomUUID().toString();
        double[] movements = {200, -100, 500, -200, -400, -900, 400, 0, -100};
        Account account = new Account(id, "Igli", initialBalance);
        for(double movement: movements)
            makeTransaction(account, movement);
        account.printTransactions();
        System.out.println(initialBalance == account.getInitialBalance());
    }

    private static void makeTransaction(Account account, double movement) {
        System.out.println((movement > 0) ? "Making a deposit ..." : "Making a withdraw ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.makeTransaction(movement);
    }

}
