public class CastingDemo {
    public static void main(String[] args) {
        Object obj1 = new Circle(1); // implicit casting
        Object obj2 = new Rectangle(3, 4);
        displayObject(obj1);
        displayObject(obj2);
    }
    public static void displayObject(Object object) {
        if(object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle)object).getArea()); // explicit casting
            System.out.println("The circle diameter is " + ((Circle)object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
