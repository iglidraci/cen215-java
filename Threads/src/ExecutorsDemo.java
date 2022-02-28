import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new PrintChars('a', 50));
        executorService.execute(new PrintChars('b', 50));
        executorService.execute(new PrintChars('c', 50));
        executorService.shutdown();
    }
}
