public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        /**
         * Some talking points regarding inheritance
         * 1) A subclass is not a subset of its superclass
         * 2) Private data fields in a superclass are not accessible outside the class (only through get/set)
         * 3) Not all is-a relationships should be modeled through inheritance (Square is Rectangle)
         * 4) Do not extend a class just for the sake of reusing methods (Person, Tree, both have height and weight)
         * 5) In Java you can inherit directly from only one superclass (single inheritance)
         */
    }
}
