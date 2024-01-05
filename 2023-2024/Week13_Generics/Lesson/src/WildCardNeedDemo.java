public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1); stack.push(2); stack.push(3);
        double max = max(stack);
        System.out.println(max);
        /*
        The fact is Integer is a subtype of Number, but GenericStack<Integer> is not a subtype of GenericStack<Number>
        Fix it with wildcard generics
        ? unbounded wildcard, any object
        ? extends T, bounded wildcard, T or subtype of T
        ? super T, lower bound wildcard, T or supertype of T
        .*/
    }

    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;
    }
}
