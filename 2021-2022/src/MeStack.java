import java.util.ArrayList;

public class MeStack<T> {
    private final ArrayList<T> stack;
    private final int TEST = 10;
    public MeStack() {
        stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int getSize() {
        return stack.size();
    }
    public T peek() {
        return stack.get(getSize() - 1);
    }
    public T pop() {
        var topElement = peek();
        stack.remove(getSize() - 1);
        return topElement;
    }
    public void push(T element) {
        stack.add(element);
    }
    public int search(T element) {
        int index = stack.lastIndexOf(element);
        return index == - 1 ? -1 : getSize() - 1 - index;
    }
}
