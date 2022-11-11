public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    // construct a stack with default capacity 16
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    // construct a stack with specified capacity
    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    // push a new integer to the top of the stack
    public void push(int value) {
        if (size >= elements.length) {
            // copy all the elements into a bigger array
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    // remove and return the top element of the stack
    public int pop() {
        return elements[--size];
    }
    // return the top element without removing it from stack
    public int peek() {
        return elements[size-1];
    }
    // test whether stack is empty
    public boolean isEmpty() {
        return size == 0;
    }
    // return the number of elements in the stack
    public int getSize() {
        return size;
    }
}
