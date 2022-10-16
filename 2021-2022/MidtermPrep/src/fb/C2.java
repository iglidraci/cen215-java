package fb;

import fa.S1;

public class C2 extends S1 {
    {
        System.out.println("C2 instance initializer");
    }
    static {
        System.out.println("C2 static scope");
        System.out.println("C2 static scope in the end of the file");
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
        var c22 = new C2();
        var s1 = new S1();
        var s12 = new S1();
        S1.nada++;
        System.out.println(++C2.nada);
        System.out.println(S1.nada);
    }
}
