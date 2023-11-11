public class InvalidRadiusException extends Exception {
    public InvalidRadiusException(double radius) {
        super("Invalid radius: " + radius);
    }
}

/**
 * You can extend from RuntimeException class as well, but it is a bad practice since
 * it makes your custom exception unchecked
 */
