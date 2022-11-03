public class Circle {
    double radius;
    static int nrOfObjects;
    /** Construct a circle with radius 1 */
    Circle() {
        radius = 1.;
        nrOfObjects++;
    }
    /** Construct a circle with a specified radius */
    Circle(double newRadius) {
        radius = newRadius;
        nrOfObjects++;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    static int getNrOfObjects() {
        return nrOfObjects;
    }
}
