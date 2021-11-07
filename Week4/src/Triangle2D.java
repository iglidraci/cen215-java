public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Triangle2D() {
        this.p1 = new MyPoint(0, 0);
        this.p2 = new MyPoint(1, 1);
        this.p3 = new MyPoint(2, 5);
    }
    
    public double getPerimeter() {
        double a = getA();
        double b = getB();
        double c = getC();
        return a+b+c;
    }

    private double getC() {
        return p2.distance(p3);
    }

    private double getB() {
        return p1.distance(p3);
    }

    private double getA() {
        return p1.distance(p2);
    }

    public double getArea() {
        // use Heron's formula
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-getA())*(s-getB())*(s-getC()));
    }
}
