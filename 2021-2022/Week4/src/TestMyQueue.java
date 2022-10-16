import java.util.Random;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(random.nextInt());
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
        queue.enqueue(20);
        System.out.println(queue.dequeue());
    }
}
