import java.util.ArrayList;

public class GenericStack<T> {
    private final ArrayList<T> stack = new ArrayList<>();
    public GenericStack(){}
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
}
