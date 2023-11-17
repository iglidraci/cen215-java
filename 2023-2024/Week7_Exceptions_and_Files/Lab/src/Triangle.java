public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if(a + b < c || a + c < b || b + c < a)
            throw new IllegalTriangleException(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
