public class TestLinearEquation {
    public static void main(String[] args) throws Exception {
        var linEq = new LinearEquation(5, 4, 3, -6, 1, 2);
        var x = linEq.getMyX();
        var y = linEq.getMyY();
        System.out.println("x = " + x[0] + "/"+ x[1]);
        System.out.println("y = " + y[0] + "/"+ y[1]);
        var quadraticEq = new QuadraticEquation(2, 3, -5);
        System.out.println(quadraticEq.getRoot1());
        System.out.println(quadraticEq.getRoot2());
    }
}
