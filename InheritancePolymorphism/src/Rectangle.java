public class Rectangle extends GeometricObjects {
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(boolean isFilled, String color, double width, double height) {
        super(color, isFilled);
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return super.toString() + ";Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    public static void printObject() {
        System.out.println("This is a rectangle");
    }
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
