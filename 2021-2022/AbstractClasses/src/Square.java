public class Square extends GeometricObject{
    private double side;
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public Square() {

    }

    public Square(String stroke, String fill, double side) {
        super(stroke, fill);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + super.toString();
    }
}
