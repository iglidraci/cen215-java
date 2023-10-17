public class Circle {
    double radius;
    static int numberOfCircles = 0;
    static final double PI = 3.14;
    /** Construct a circle with radius 1 */
    Circle() {
        radius = 1.;
        numberOfCircles++;
    }
    /** Construct a circle with a specified radius */
    Circle(double newRadius) {
        radius = newRadius;
        numberOfCircles++;
    }

    double getArea() {
        return PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * PI * radius;
    }

    static void printNumberOfCircles() {
        System.out.println("Number of circles is " + numberOfCircles);
    }
}
