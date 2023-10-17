public class CircleEncapsulated {
    private static int nrOfObjects = 0;
    private double radius = 1;
    public CircleEncapsulated() {
        nrOfObjects++;
    }
    public CircleEncapsulated(double newRadius) {
        radius = newRadius;
        nrOfObjects++;
    }
    public static int getNrOfObjects() {
        return nrOfObjects;
    }

    // getter
    public double getRadius() {
        return radius;
    }

    // setter
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
