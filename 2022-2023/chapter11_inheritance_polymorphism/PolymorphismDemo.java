public class PolymorphismDemo {
    /**
     * Polymorphism means that a variable of a supertype can refer to a subtype object
     * Every instance of a subclass is also an instance of its superclass but not vice-versa
     * You can always pass an instance of a subclass to a parameter of its superclass
     */
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red", true);
        Rectangle rectangle = new Rectangle(3, 3, "blue", false);
        printGeometricObject(circle);
        printGeometricObject(rectangle);
    }

    // Display geometric object properties
    public static void printGeometricObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
