public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        double distance = myPoint1.distance(myPoint2);
        System.out.printf("%s distance from %s is %.2f\n", myPoint1, myPoint2, distance);
        System.out.printf("%s distance from %s is %.2f\n", myPoint1, myPoint2, MyPoint.distance(myPoint1, myPoint2));
        double x2 = 35;
        double y2 = 35.5;
        distance = myPoint1.distance(x2, y2);
        System.out.printf("%s distance from (%.2f, %.2f) = %.2f\n", myPoint1, x2, y2, distance);
    }
}
