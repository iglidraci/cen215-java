public class MyPoint {
    private final double x;
    private final double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint otherPoint) {
        return getDistance(x, y, otherPoint.getX(), otherPoint.getY());
    }
    private static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }
    public double distance(double x, double y) {
        return getDistance(this.x, this.y, x, y);
    }
    public static double distance(MyPoint point1, MyPoint point2) {
        return getDistance(point1.x, point1.y, point2.x, point2.y);
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
