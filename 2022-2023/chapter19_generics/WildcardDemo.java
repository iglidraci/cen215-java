import java.util.Date;
import java.util.GregorianCalendar;

public class WildcardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1); stack.push(2); stack.push(3);
        emptyAndPrintStack(stack);
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack1.push("Foo");
        stack1.push("Bar");
        stack1.push("Baz");
        stack2.push(new Date());
        stack2.push(new GregorianCalendar());
        extendStack1(stack1, stack2);
        emptyAndPrintStack(stack2);
    }
    public static void emptyAndPrintStack(GenericStack<?> stack) {
        // <?> is a wildcard that represents any object type
        // same as <? extends Object>
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static<E> void extendStack1(GenericStack<E> stack1, GenericStack<? super E> stack2) {
        // ? super T, called a lower bound wildcard, denotes T or a supertype of T
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public static<E> void extendStack2(GenericStack<? extends E> stack1, GenericStack<E> stack2) {
        // ? super T, called a lower bound wildcard, denotes T or a supertype of T
        extendStack1(stack1, stack2);
    }

}
