public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(100);
        System.out.println("Radius of the first circle " + circle1.radius);
        System.out.println("Area of the first circle " + circle1.getArea());
        System.out.println("Perimeter of the first circle " + circle1.getPerimeter());
        System.out.println("Radius of the second circle " + circle2.radius);
        System.out.println("Area of the second circle " + circle2.getArea());
        System.out.println("Perimeter of the second circle " + circle2.getPerimeter());
        System.out.println("Radius of the third circle " + circle3.radius);
        System.out.println("Area of the third circle " + circle3.getArea());
        System.out.println("Perimeter of the third circle " + circle3.getPerimeter());
        circle3.radius = 1000;
        System.out.println("Radius of the third circle after changing it " + circle3.radius);
        System.out.println("Area of the third circle after changing radius " + circle3.getArea());
        System.out.println("Perimeter of the third circle after changing radius " + circle3.getPerimeter());
    }
}
