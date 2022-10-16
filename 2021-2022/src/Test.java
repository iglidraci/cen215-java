import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        var stack = new MeStack<Integer>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSize());
        stack.push(1);
        stack.push(2);
        stack.push(20);
        stack.push(2);
        assert stack.search(2) == 0;
        assert stack.search(20) == 1;
        assert stack.peek() == 2;
        assert stack.pop() == 2;
        assert stack.pop() == 20;
        assert stack.pop() == 2;
        assert stack.search(1) == 0;
        var c2 = new Circle();
        System.out.println("Nr of objects = "+Circle.getNumberOfObjs());
        ImmutableC c = new ImmutableC();
//        var date = c.getD();
//        System.out.println(c.getD().getTime());
//        date.setTime(100);
//        System.out.println(c.getD().getTime());
        System.out.println("arrays");
        var array = c.getA();
        System.out.println(c.getA()[0]);
        array[0] = 100;
        System.out.println(c.getA()[0]);
    }
}
