public class Test implements Runnable{
    public Test() {
        (new Thread(this)).start();
        (new Thread(this)).start();
        Thread thread = new Thread(this);
        thread.start();
        // thread.start();
    }
    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Test();
    }
}
