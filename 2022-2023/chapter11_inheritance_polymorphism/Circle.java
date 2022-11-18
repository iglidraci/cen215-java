public class Circle extends GeometricObject { // extend superclass
    private double radius;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        // this.color = color; // this is illegal since color is private in the superclass
        setColor(color);
        setFilled(filled);
    }
    /*
    Getter and setter for radius
     */
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // return area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // return diameter
    public double getDiameter() {
        return 2 * radius;
    }
    // return perimeter
    public double getPerimeter() {
        return Math.PI * getDiameter();
    }
}
