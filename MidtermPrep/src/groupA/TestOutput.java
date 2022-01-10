package groupA;
import java.io.IOException;

public class TestOutput {
    {System.out.println("Test Call");}
    public static void main(String[] args) throws IOException {
        int i = 0;
        First[] k = {
                new First(),
                new Second("215"),
                new First("Epoka"),
                new Second() };
        for (Object x: k) {
            if ( x instanceof Second)
                i = ((Second) x).process();
            else
                i = ((First) x).mk(i);  System.out.println(x +
                    " has value " + i);  }
        System.out.println(new First(  ""+new Second("Test")));
        System.out.println();
    }
}

