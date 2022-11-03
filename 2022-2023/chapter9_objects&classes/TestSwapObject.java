public class TestSwapObject {
    public static void main(String[] args) {
        Square square1 = new Square(1);
        Square square2 = new Square(2);
        swap1(square1, square2);
        System.out.println("After swap1: square1 = " +
                square1.side + " square2 = " + square2.side);
        swap2(square1, square2);
        System.out.println("After swap2: square1 = " +
                square1.side + " square2 = " + square2.side);
    }
    public static void swap1(Square x, Square y) {
        Square temp = x;
        x = y;
        y = temp;
    }
    public static void swap2(Square x, Square y) {
        double temp = x.side;
        x.side = y.side;
        y.side = temp;
    }
}
class Square {
    double side;
    Square(double newSide) {
        side = newSide;
    }
}

