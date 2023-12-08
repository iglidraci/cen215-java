public class Square extends GeometricObject implements Colorable, Comparable<Square>, Cloneable{

    private double side;
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public Square() {
        this(0, "black");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all sides with " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public int compareTo(Square o) {
        return Double.compare(side, o.side);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Square square) {
            return Double.compare(side, square.side) == 0;
        }
        return false;
    }
}
