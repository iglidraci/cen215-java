public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(int a, int b, int c) {
        super("Invalid triangle with sides " + String.format("%d, %d, %d", a, b, c));
    }
}
