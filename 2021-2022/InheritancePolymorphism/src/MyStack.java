import java.util.ArrayList;
import java.util.Arrays;

public class MyStack<T> {
    private final ArrayList<T> stack = new ArrayList<>();
    public MyStack(){}
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    public int getSize() {
        return stack.size();
    }
    public void push(T element) {
        stack.add(element);
    }
    public T pop() {
        if (isEmpty())
            return null;
        else
            return stack.remove(getSize() - 1);
    }
    public T peek() {
        if (isEmpty())
            return null;
        else return stack.get(getSize() - 1);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + stack +
                '}';
    }
}
