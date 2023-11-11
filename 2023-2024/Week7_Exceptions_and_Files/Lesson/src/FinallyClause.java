public class FinallyClause {
    /**
     * The code in the 'finally' block is executed under all circumstances,
     * regardless of whether an exception occurs in the try block or is caught
     * 1) If no exception arises in the try block
     * 2) If a statement causes an exception in the try block that is caught in a catch block
     * 3) If one of the statements causes an exception that is not caught in any catch block
     */
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            { // assume this whole block represents statement 2
                Object obj = null;
                System.out.println(obj.toString());
                System.out.println("statement 2");
            }
            System.out.println("statement 3");
        } catch (NullPointerException ex) {

        } finally {
            System.out.println("statement 4");
        }
        System.out.println("Statement 5");
    }
}
