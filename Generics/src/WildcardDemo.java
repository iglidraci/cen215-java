import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class WildcardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(2);
        intStack.push(3);
        intStack.push(1);
        intStack.push(5);
        GenericStack<Object> objectStack = new GenericStack<>();
        objectStack.push("hello");
        objectStack.push(new Date());
        objectStack.push(2.5);
        // printStack(intStack);
        // cannot do this, GenericStack<Integer> is not a subtype of GenericStack<Number>
        // even though Integer is a subtype of Number
        printNumberStack(intStack);
        printGenericStack(objectStack);
        GenericStack<Character> chars = new GenericStack<>();
        chars.push('a');
        chars.push('w');
        chars.push('b');
        GenericStack<Object> objs = new GenericStack<>();
        objs.push(new Date());
        objs.push(new Random());
        objs.push(new ArrayList<Number>());
        mergeStacks(chars, objs);
        printGenericStack(objs);
    }
    public static void printStack(GenericStack<Number> numberStack) {
        while (!numberStack.isEmpty())
            System.out.print(numberStack.pop() + " ");
        System.out.println();
    }
    // bounded wildcard
    // ? extends Number means Number or any subtype of Number
    public static void printNumberStack (GenericStack<? extends Number> numberStack) {
        while (!numberStack.isEmpty())
            System.out.print(numberStack.pop() + " ");
        System.out.println();
    }
    // unbounded wildcards
    // same as ? extends Object
    public static void printGenericStack (GenericStack<?> stack) {
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }
    // lower bound wildcard
    // ? super T means T or any supertype of T
    public static<T> void mergeStacks(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }
}
