package fa;

public class S1 {
    {
        System.out.println("S1 instance initializer");
    }
    private static int a = 0;
    public static int nada = 0;
    private String b;
    private int c;
    protected String name = "S1";
    static {
        // executes before every constructor BUT AFTER super()
        System.out.println("S1 static scope");
        System.out.println("S1 static scope in the end of the file");
    }
    public S1() {
        this("", 0);
        System.out.println("S1 empty");
    }
    public S1(String x, int y) {
        b = x;
        c = y;
        System.out.println("S1 " + x);
    }
    public int boo (String x) {
        a += 5;
        b += "." + x;
        c*=3;
        System.out.println(b);
        return a + c;
    }
}
