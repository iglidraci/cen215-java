public class Circle {
    private double radius;
    private static int numberOfObjects = 0;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException { // declare exception
        if (radius >= 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius cannot be negative"); // throw exception
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
