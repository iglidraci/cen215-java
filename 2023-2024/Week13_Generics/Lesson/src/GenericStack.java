import java.util.ArrayList;

public class GenericStack<E> {
    private final ArrayList<E> elements = new ArrayList<>();
    public void push (E element) {
        this.elements.add(element);
    }
    public E peek() {
        return this.elements.get(this.elements.size() - 1);
    }
    public int size() {
        return this.elements.size();
    }
    public boolean isEmpty() {
        return size() == 0;
    }

    public E pop() {
        E top = peek();
        this.elements.remove(size() - 1);
        return top;
    }

    @Override
    public String toString() {
        return "Stack: " + this.elements;
    }
}
