public class TestRectangles {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                new Rectangle(2., 3.),
                new Rectangle(3., 1.5)
        };
        System.out.printf("%-20s %-20s %-20s\n", "Rectangles", "Perimeter", "Area");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.printf("%-20s %-20.2f %-20.2f\n", "Rectangle " + (i+1),
                                rectangles[i].getPerimeter(), rectangles[i].getArea());
        }
    }
}
