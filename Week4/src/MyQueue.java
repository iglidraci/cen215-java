// queue for storing int values only
public class MyQueue {
    private int[] numbers = new int[100];
    private int count = 0;
    private int queueTop = 0;
    public boolean isEmpty() {
        return getCount() == 0;
    }
    public int getCount() {
        return count - queueTop;
    }
    public void enqueue(int value) {
        // take care in case there is no more space in the array
        // same solution as in Course class
        numbers[count++] = value;
    }
    public int peek() {
        return this.numbers[queueTop];
    }
    public int dequeue() {
        int value = peek();
        queueTop++;
        return value;
    }
    public void clear() {
        this.queueTop = 0;
        this.count = 0;
    }
}
