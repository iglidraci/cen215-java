public class TotalArea {
    public static void main(String[] args) {
        CircleEncapsulated[] circleArray; // Declare circleArray
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static void printCircleArray(CircleEncapsulated[] circleArray) {
        double totalArea = 0;
        for(CircleEncapsulated circle : circleArray) {
            System.out.println("Radius: " + circle.getRadius() + ", area: " + circle.getArea());
            totalArea += circle.getArea();
        }
        System.out.println("Total area: " + totalArea);
    }

    public static CircleEncapsulated[] createCircleArray() {
        CircleEncapsulated[] circles = new CircleEncapsulated[5];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new CircleEncapsulated(Math.random() * 100);
        }
        return circles;
    }
}
