import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithoutSync {
    private static final Account account = new Account();
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    account.deposit(1);
                }
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println("Balance now is " + account.getBalance());
    }
}

class Account {
    private static final Lock lock = new ReentrantLock();
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        // or you can just add the keyword synchronized to the method
        // public synchronized void deposit
        lock.lock(); // acquire the lock
        int newBalance = balance + amount;
        try {
            Thread.sleep(5);
            balance = newBalance;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // release the lock
        }

    }
}
