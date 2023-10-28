public class TestQueue {
    public static void main(String[] args) {
        QueueOfIntegers queue = new QueueOfIntegers();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
        queue.enqueue(0);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(4);
        queue.enqueue(5);
    }
}
