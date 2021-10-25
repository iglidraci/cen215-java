import java.util.Objects;

public class Circle extends GeometricObjects{
    private double radius;

    public double getRadius() {
        return radius;
    }
    public Circle(boolean isFilled, String color, double radius) {
        super(color, isFilled);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ";Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
