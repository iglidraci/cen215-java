public class Casting {
    public static void main(String[] args) {
        GeometricObject obj1 = new Circle(2.5); // implicit casting (upcasting)
        /*
            Circle obj2 = obj1; // -> you can't do that even though obj1 is a Circle
            The reason for that is that a Circle object is always an instance of Object class
            An Object instance is not necessarily an instance of Circle
         */
        Circle obj2 = (Circle) obj1; // explicit casting (down-casting)
        /**
         * If the superclass object is not an instance of the subclass, a runtime
         * ClassCastException occurs
         */
        GeometricObject obj3 = new Rectangle(3, 4);
        displayGeometricObject(obj1);
        displayGeometricObject(obj3);
        /**
         * Casting a primitive value is different from casting an object reference
         */
        int age = 45;
        byte newAge = (byte)age; // A new value is assigned to newAge
        Object o = new Circle();
        Circle c = (Circle)o; // No new object is created
        // Both o and c point to the same object
    }

    public static void displayGeometricObject(GeometricObject obj) {
        // The declared type decides which methods to call at compile time
        // If you need to getDiameter(), cast it first
        if (obj instanceof Rectangle) {
            System.out.println("Rectangle area is " + ((Rectangle)obj).getArea());
        } else if (obj instanceof Circle) {
            System.out.println("Circle area is " + ((Circle)obj).getArea());
        }
    }
}
