public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleEncapsulated c = new CircleEncapsulated(2.5);
        System.out.println(c.getArea());
        c.setRadius(5.5);
        System.out.println(c.getArea());
        System.out.println(new CircleEncapsulated(10).getArea());
        System.out.println(CircleEncapsulated.getNrOfObjects());
    }
}
