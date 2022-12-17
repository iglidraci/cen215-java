public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-5);
            Circle c3 = new Circle();
        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
            System.out.println(ex);
        }
        System.out.println("Number of created objects: " + Circle.getNumberOfObjects());
    }
}
