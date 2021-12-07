package k2;

import k1.M;

public class O extends M {
    private String i;
    public O(String x) {
        i = x+a;
        System.out.println(i+k++);
    }
    public O(String x, int y) {
        super(y, x);
        System.out.println("->O");
    }
    public int mk() {
        m2();
        System.out.println(i + super.mk(k));
        return k;
    }
    public void m2() {
        i = this.toString();
        k+=10;
    }

}
