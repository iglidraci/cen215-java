public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    /*
    Getter and setter for width
     */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    /*
    Getter and setter for height
     */
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // returning area
    public double getArea() {
        return width * height;
    }
    // returning perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

