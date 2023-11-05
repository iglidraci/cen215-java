public class PolymorphismDemo {
    public static void main(String[] args) {
        displayGeometricObject(new Circle(1, "red", false));
        displayGeometricObject(new Rectangle(1, 1, "black", true));
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
