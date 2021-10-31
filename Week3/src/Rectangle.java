public class Rectangle {
    private double height = 1.;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width = 1.;

    public Rectangle() {}
    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getPerimeter() {
        return 2*(this.getHeight() + this.getWidth());
    }
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
