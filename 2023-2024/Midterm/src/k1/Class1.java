package k1;
public class Class1 {
    protected static int k;
    private int i;
    protected final String a;
    public Class1() {
        a = "SWE";
        i += --k;
        System.out.println(a + i);
    }
    public Class1(int a, String s) {
        this.i = a;
        this.a = s;
        System.out.println(s.length() > 0 ? s:"def");
    }
    public int mk(int s) {
        i += 2*k+s;
        return i-1;
    }
    public String toString() {
        return a + "[i:" + i + "]";
    }
}

