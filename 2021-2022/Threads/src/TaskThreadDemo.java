public class TaskThreadDemo {
    public static void main(String[] args) {

        Runnable[] runnables = {
                new PrintChars('a', 100),
                new PrintChars('b', 200),
                () -> {
                    int i = 0;
                    while (i < 100){
                        System.out.print(++i + " ");
//                        try {
//                            Thread.sleep(1);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                    }

                }
        };
        Thread[] threads = new Thread[runnables.length];
        for (int i = 0; i < runnables.length; i++) {
            threads[i] = new Thread(runnables[i]);
        }
        threads[threads.length - 1].setPriority(Thread.MAX_PRIORITY);
        // start threads
        for (Thread thread: threads)
            thread.start();
        // wait for all threads to finish then print end
        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End");
    }
}

class PrintChars implements Runnable {
    private final char c;
    private int nr;
    public PrintChars(char c, int nr) {
        this.c = c;
        this.nr = nr;
    }

    @Override
    public void run() {
        while (nr-- > 0)
            System.out.print(c + " ");
    }
}
