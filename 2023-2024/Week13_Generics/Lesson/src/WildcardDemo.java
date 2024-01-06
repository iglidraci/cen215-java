public class WildcardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1); stack.push(2); stack.push(3);
        emptyAndPrintStack(stack);
        // What happens if we replace GenericStack<?> with GenericStack<Object>
        // Will it work?
    }
    public static void emptyAndPrintStack(GenericStack<?> stack) {
        // <?> is a wildcard that represents any object type
        // same as <? extends Object>
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
