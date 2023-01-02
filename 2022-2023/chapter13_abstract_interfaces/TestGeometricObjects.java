public class TestGeometricObjects {
    public static void main(String[] args) {
        GeometricObject circle = new Circle("red", 10);
        GeometricObject rectangle = new Rectangle("blue", 5, 2);
        System.out.println("The two objects have the same area? " + equalsArea(circle, rectangle));
        displayGeometricObject(circle);
        displayGeometricObject(rectangle);
    }

    private static void displayGeometricObject(GeometricObject geometricObject) {
        System.out.println("Area: " + geometricObject.getArea());
        System.out.println("Perimeter: " + geometricObject.getPerimeter());
    }

    private static boolean equalsArea(GeometricObject obj1, GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }
}
