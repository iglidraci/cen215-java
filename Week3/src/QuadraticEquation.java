public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminator() {
        return Math.pow(b, 2) - 4*a*c;
    }
    public double getRoot1() throws Exception {
        double D = getDiscriminator();
        if (D < 0)
            throw new Exception("Discriminator = " + D);
        return (-b - Math.sqrt(D))/(2*a);
    }
    public double getRoot2() throws Exception {
        double D = getDiscriminator();
        if (D < 0)
            throw new Exception("Discriminator = " + D);
        return (-b + Math.sqrt(D))/(2*a);
    }
}
