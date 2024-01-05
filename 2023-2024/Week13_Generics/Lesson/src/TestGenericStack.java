public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Foo");
        stack.push("Bar");
         // stack.push(1); // compile error
        stack.push("Baz");
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
