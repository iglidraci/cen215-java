package abstract_classes;

public class Rectangle extends GeometricObject {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1 > 0 ? side1 : 0;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2 > 0 ? side2 : 0;
    }

    public Rectangle(String color, double s1, double s2) {
        super(color);
        setSide1(s1);
        setSide2(s2);
    }
    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

}
