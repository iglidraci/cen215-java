public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            System.out.println("Trace info obtained from getStackTrace");
            for(StackTraceElement traceElement : ex.getStackTrace()) {
                System.out.print("Method " + traceElement.getMethodName());
                System.out.print("(" + traceElement.getClassName() + ":");
                System.out.print(traceElement.getLineNumber() + ")\n");
            }
        }
        System.out.println("Number of created objects: " + CircleWithException.getNumberOfObjects());
    }
}
