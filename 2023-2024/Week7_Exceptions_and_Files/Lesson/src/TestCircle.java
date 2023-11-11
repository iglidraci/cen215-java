public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-5);
            Circle c3 = new Circle();
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
        System.out.println("Number of created objects: " + Circle.getNumberOfObjects());
    }
}
