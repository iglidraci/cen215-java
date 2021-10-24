public class Circle {
    private final double radius;
    private final double x;
    private final double y;
    private static int numberOfObjs = 0;
    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        numberOfObjs ++;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public static int getNumberOfObjs() {
        return numberOfObjs;
    }
    Circle(){
        this(1., 1., 1.);
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
