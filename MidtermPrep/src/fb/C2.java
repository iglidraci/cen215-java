package fb;

import fa.S1;

public class C2 extends S1 {
    static {
        System.out.println("C2 static scope");
    }
    public C2() {
        super("", 0);
        System.out.println("C2 empty");
    }
    public int boo(String x) {
        return super.boo(x) + 4;
    }

    public static void main(String[] args) {
        var c2 = new C2();
    }
    static  {
        System.out.println("C2 static scope in the end of the file");
    }
}
