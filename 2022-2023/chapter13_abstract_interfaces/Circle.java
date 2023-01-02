public class Circle extends GeometricObject {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    public Circle(String color, double radius) {
        super(color);
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
