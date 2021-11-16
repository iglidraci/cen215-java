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

    public boolean contains(MyPoint p) {
        /*
        Let the points of our triangle be A B and C.
        P is our given point
        1) Calculate area of the triangle ABC. Let this area be A.
        2) Calculate area of the triangle PAB. Let this area be A1.
        3) Calculate area of the triangle PBC. Let this area be A2.
        4) Calculate area of the triangle PAC. Let this area be A3.
        5) A1 + A2 + A3 must be equal to A if P is inside our triangle
        */
        double a = getArea();
        double a1 = new Triangle2D(p, p1, p2).getArea();
        double a2 = new Triangle2D(p, p2, p3).getArea();
        double a3 = new Triangle2D(p, p1, p3).getArea();
        double total = a1 + a2 + a3;
        System.out.println("Current are " + a);
        System.out.println("Total pieces area " + total);
        return String.format("%.5f", a).equals(String.format("%.5f", total));
    }
}
