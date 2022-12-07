package ex9;

public class Test {
    public static void main(String[] args) {
        int i = 0;
        First[] k = {
                new First(),
                new Second("215"),
                new First("Java"),
                new Second()
        };
        for (Object x : k) {
            if (x instanceof Second)
                i = ((Second)x).process();
            else
                i = ((First) x).mk(i);
        }
    }
}
