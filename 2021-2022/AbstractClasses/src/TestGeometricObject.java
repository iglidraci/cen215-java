public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject obj1 = new Circle("black", "stroke", 4);
        GeometricObject obj2 = new Square("white", "red", 4);
        printGeoObject(obj1);
        printGeoObject(obj2);
        boolean equal = equalArea(obj1, obj2);
        System.out.println(obj1 + " and " + obj2 + " are " + (equal ? "" : " not ") + "equal");
    }

    private static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }

    private static void printGeoObject(GeometricObject obj) {
        System.out.println("Perimeter of " + obj + ":" + obj.getPerimeter());
        System.out.println("Area of " + obj + ":" + obj.getArea());
    }

}
