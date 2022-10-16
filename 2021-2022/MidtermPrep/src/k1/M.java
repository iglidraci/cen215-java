package k1;

public class M {
    protected static int k;
    private int i = 0;
    protected final String a;
    public M() {
        a = "CEN";
        i = ++k;
        System.out.println(a + i);
    }
    public M(int a, String s) {
        this.i = a;
        this.a = s;
        System.out.println("M->"+s);
    }
    public int mk(int s) {
        i += 2*k+s;
        return i-1;
    }
    public String toString() {
        return a + "[i:" + i + "]";
    }
}
