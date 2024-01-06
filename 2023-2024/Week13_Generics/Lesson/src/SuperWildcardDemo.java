import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SuperWildcardDemo {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack1.push("Foo");
        stack1.push("Bar");
        stack1.push("Baz");
        stack2.push(new Date());
        stack2.push(new GregorianCalendar());
        stack2.push(new ArrayList<Integer>(List.of(1, 2, 3, 4)));
        stack2.push(2);
        extendStack(stack1, stack2);
        WildcardDemo.emptyAndPrintStack(stack2);
    }
    public static<E> void extendStack(GenericStack<E> stack1, GenericStack<? super E> stack2) {
        // ? super T, called a lower bound wildcard, denotes T or a supertype of T
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
