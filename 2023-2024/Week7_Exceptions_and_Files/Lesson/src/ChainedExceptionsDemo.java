public class ChainedExceptionsDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception ex) {
            throw new Exception("new info from method 1", ex);
        }
    }

    private static void method2() throws Exception {
        throw new Exception("info from method2");
    }
}
