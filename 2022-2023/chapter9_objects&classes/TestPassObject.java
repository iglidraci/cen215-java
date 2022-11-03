public class TestPassObject {
    public static void main(String[] args) {
        CircleEncapsulated circle = new CircleEncapsulated(1);
        final int nrOfTimes = 5;
        printCircle(circle, nrOfTimes);
        System.out.println(circle.getRadius());
    }

    static void printCircle(CircleEncapsulated circle, int nrOfTimes) {
        while (nrOfTimes-- > 0) {
            System.out.println(circle.getArea());
            circle.setRadius(circle.getRadius()+1);
        }
    }
}
