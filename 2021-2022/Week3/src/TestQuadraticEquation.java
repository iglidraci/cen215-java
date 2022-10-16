public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(-2, 2, 1);
        double root1 = qe.getRoot1();
        double root2 = qe.getRoot2();
        // you should check first if we have a solution or not
        // then check if the roots are the same, display only one
        System.out.println("Root 1 = " + root1);
        System.out.println("root 2 = " + root2);
    }
}
