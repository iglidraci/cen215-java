public class TestPair {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(2, 3);
        Pair<String> pair2 = new Pair<>("hello", "world");
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("bar");
        stack1.push("foo");
        GenericStack<String> stack2 = new GenericStack<>();
        stack2.push("qux");
        Pair<GenericStack<String>> pair3 = new Pair<>(stack1, stack2);
        System.out.println(smallestValue(pair));
        System.out.println(smallestValue(pair2));
        // System.out.println(smallestValue(pair3));
        // cannot do this
    }
    public static<T extends Comparable<T>> T smallestValue(Pair<T> pair) {
        int result = pair.getObj1().compareTo(pair.getObj2());
        if (result <= 0)
            return pair.getObj1();
        return pair.getObj2();
    }
}
