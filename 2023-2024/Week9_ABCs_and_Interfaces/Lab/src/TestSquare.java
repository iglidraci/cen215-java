public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square(4, "white");
        Square sq3 = (Square) (sq2.clone());
        System.out.println(sq1.compareTo(sq2));
        System.out.println(sq2.compareTo(sq3));
        sq3.howToColor();
        System.out.println(sq3.getArea());
    }
}
