public class TestTriangle2D {
    public static void main(String[] args) {
        Triangle2D triangle2D = new Triangle2D();
        System.out.printf("Perimeter=%.2f\n", triangle2D.getPerimeter());
        System.out.printf("Area=%.2f\n", triangle2D.getArea());
        Triangle2D triangle2 = new Triangle2D(new MyPoint(0, 0),
                new MyPoint(0, 4), new MyPoint(4, 0));
        System.out.printf("Perimeter=%.2f\n", triangle2.getPerimeter());
        System.out.printf("Area=%.2f\n", triangle2.getArea());
    }
}
