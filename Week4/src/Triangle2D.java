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

    // Rubin Aga solution

//    public boolean contains(MyPoint p) {
//        double denominator = ((p2.getY() - p3.getY())*(p1.getX() - p3.getX()) + (p3.getX() - p2.getX())*(p1.getY() - p3.getY()));
//        double a = ((p2.getY() - p3.getY())*(p.getX() - p3.getX()) + (p3.getX() - p2.getX()) * (p.getY() - p3.getY())) / denominator;
//        double b = ((p3.getY() - p1.getY())*(p.getX() - p3.getX()) + (p1.getX() - p3.getX())*(p.getY() - p3.getY())) / denominator;
//        double c = 1 - a - b;
//        return a >= 0 && a <= 1 && b >= 0 && b <= 1 && c >= 0 && c <= 1;
//    }

    public static boolean nearlyEqual(double a, double b, double epsilon) {
        final double absA = Math.abs(a);
        final double absB = Math.abs(b);
        final double diff = Math.abs(a - b);

        if (a == b) {
            return true;
        } else if (a == 0 || b == 0 || (absA + absB < Double.MIN_NORMAL)) {

            return diff < (epsilon * Double.MIN_NORMAL);
        } else { // use relative error
            return diff / Math.min((absA + absB), Double.MAX_VALUE) < epsilon;
        }
    }
    public static double relativeEpsilon( double a, double b )
    {
        return Math.max(Math.ulp(a),Math.ulp(b));
    }

    public boolean pointInside(MyPoint p) {
        Triangle2D Triangle1=new Triangle2D(p,p1,p2);
        Triangle2D Triangle2=new Triangle2D(p,p2,p3);
        Triangle2D Triangle3=new Triangle2D(p,p1,p3);
        double a=Triangle1.getArea();
        double b=Triangle2.getArea();
        double c=Triangle3.getArea();
        double AREA=getArea();
        System.out.println(AREA);
        double subArea=a+b+c;
        double epsilon=relativeEpsilon(AREA,subArea);
        return nearlyEqual(AREA,subArea,epsilon);
    }
}
