public class PolymorphismDemo {
    public static void printGeometricObject(GeometricObjects obj) {
        if (obj instanceof Rectangle) {
            System.out.println("Instance of rectangle");
        } else if (obj instanceof Circle) {
            System.out.println("Instance of circle");
        }
        System.out.println(obj.toString());
    }
    public static void main(String[] args) {
        printGeometricObject(new Rectangle(true, "blue", 3., 5.));
        printGeometricObject(new Circle(true, "red", -2));
        // implicit casting
        GeometricObjects go = new Rectangle();
        // explicit casting
        if (go instanceof Rectangle) {
            System.out.println(((Rectangle) go).getArea());
        }
    }
}
