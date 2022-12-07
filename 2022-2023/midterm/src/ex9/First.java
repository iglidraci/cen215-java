package ex9;

public class First {
    protected static int tracker;
    private int i = 1;
    public String course = "SWE";

    public First() {
        i = --tracker;
        System.out.println(course + i);
    }

    public First(String s) {
        this.i--;
        System.out.println("Method->"+s);
    }

    public int mk(int s) {
        i += (tracker + s) + 10;
        return i--;
    }
    public String toString() {
        return course + "[i:" + i + "]";
    }
}
