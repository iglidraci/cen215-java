import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle[] array = new Rectangle[] {
                new Rectangle(true, "blue", 2., 3.),
                new Rectangle(true, "blue", 4., 2.),
                new Rectangle(true, "blue", 1., 9.),
        };
        Arrays.sort(array, (x, y) -> Double.compare(x.getWidth(), y.getWidth()));
        printArray(array);
        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(true, "blue", 4.5));
        list.add(new Circle(false, "red", 3.5));
        list.add(new Circle(true, "yellow", 7.5));
        list.sort((Circle x, Circle y) -> Double.compare(x.getArea(), y.getArea()));
        list.forEach(System.out::println);
        System.out.println("filter with radius");
        list.stream().filter(x -> x.getRadius() > 4).forEach(
                System.out::println
        );
        var sumOfArea = list.stream().map(Circle::getArea).reduce(Double::sum);
        System.out.printf("Sum of areas is %s\n", sumOfArea.isPresent()? sumOfArea.get() : "____");
        enterDistinctNumbersOnly();
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(10);
        stack.pop();
        System.out.println(stack.peek());
    }

    private static void enterDistinctNumbersOnly() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int val;
        do {
            System.out.println("Enter a number...");
            val = scanner.nextInt();
            if (!list.contains(val) && val != 0)
                list.add(val);
        } while (val != 0);
        list.forEach(System.out::println);
    }

    private static void printArray(Rectangle[] array) {
        for(Rectangle r: array)
            System.out.println(r);
    }
}
