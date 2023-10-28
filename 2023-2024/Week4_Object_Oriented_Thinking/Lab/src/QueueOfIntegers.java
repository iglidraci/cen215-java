public class QueueOfIntegers {
    private int[] data;
    private int size = 0;
    private int front = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public QueueOfIntegers(int capacity) {
        this.data = new int[capacity];
    }

    public QueueOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void enqueue(int element) {
        if(size == data.length) {
            System.out.println("Queue is full, cannot enqueue");
            System.exit(1);
        }
        int end = (front + size) % data.length;
        data[end] = element;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            System.exit(1);
        }
        int element = data[front];
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            System.exit(1);
        }
        return data[front];
    }
}
