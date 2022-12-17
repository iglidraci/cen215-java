public class Rethrowing {
    /**
     * Java allows an exception handler to rethrow the exception if the handler cannot process the exception,
     * or simply wants to let its caller be notified of the exception
     */
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            { // statement 2
                Object obj = null;
                System.out.println(obj.toString());
//                System.out.println(2/0);
                System.out.println("statement 2");
            }
            System.out.println("statement 3");
        } catch (NullPointerException ex1) {

        } catch (ArithmeticException ex2){
            throw ex2;
        } finally {
            System.out.println("statement 4");
        }
        System.out.println("Statement 5");
    }
}
