public class LinearEquation {
    private int a;
    private int b;
    private int gcd = 0;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    private int d;
    private int e;
    private int f;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setF(int f) {
        this.f = f;
    }
    public boolean isSolvable() {
        return a*d - b*c != 0;
    }
    public double getX() throws Exception {
        if (isSolvable())
            return (double) (e*d - b*f) / (a*d - b*c);
        throw new Exception("Linear equation can't be solved");
    }
    public double getY() throws Exception {
        if (isSolvable())
            return (double)(a*f - e*c)/(a*d - b*c);
        throw new Exception("Linear equation can't be solved");
    }

    public int[] getMyY() throws Exception {
        if (isSolvable()) {
            int num = a*f - e*c;
            int det = a*d - b*c;
            int gcd = getGcd(num, det);
            return new int[] {num/gcd, det/gcd};
        }
        throw new Exception("Linear equation can't be solved");
    }

    public int[] getMyX() throws Exception {
        if (isSolvable()) {
            int num = (e*d - b*f);
            int det = (a*d - b*c);
            int gcd = getGcd(num, det);
            return new int[] {num/gcd, det/gcd};
        }
        throw new Exception("Linear equation can't be solved");
    }

    private int getGcd(int b, int d) {
        if (d == 0)
            return b;
        return getGcd(d, b%d);
    }
}
