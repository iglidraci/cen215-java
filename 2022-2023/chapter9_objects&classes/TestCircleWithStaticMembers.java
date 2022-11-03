public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Nr of objects before any instantiation: " + Circle.nrOfObjects);
        Circle c1 = new Circle();
        System.out.println("Nr of objects after c1 and before c2 and c3: " + Circle.nrOfObjects);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        System.out.println("Nr of objects after c2 and c3: " + Circle.getNrOfObjects());
    }
}
