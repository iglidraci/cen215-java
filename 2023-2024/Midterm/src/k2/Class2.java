package k2;
import k1.Class1;
public class Class2 extends Class1 {
    private String i;
    public Class2(String x) {
        i = x+a;
        System.out.println(++k + i);
    }
    public Class2(String x, int y) {
        super(y, x);
    }
    public int mk() {
        m2(true);
        System.out.println(i + super.mk(k));
        return k;
    }
    public void m2(boolean b) {
        i = this.toString();
        if(b || m3())
            k+= 5;
    }
    private boolean m3() {
        k+=10;
        return Math.random() > 0.5;
    }
}

