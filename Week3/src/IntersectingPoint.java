import java.security.InvalidAlgorithmParameterException;

public class IntersectingPoint {
    public static void main(String[] args) {
        Equation eq1 = findEquation(2, 0, 2, 9);
        Equation eq2 = findEquation(4, 0, 4, 4);
        LinearEquation linearEquation = new LinearEquation(eq1, eq2);
        try{
            double x = linearEquation.getX();
            double y = linearEquation.getY();
            System.out.println("x=" + x + " and y=" + y);

        } catch (InvalidAlgorithmParameterException exception) {
            System.out.println(exception.getMessage());
        }
    }
    public static Equation findEquation(double x1, double y1, double x2, double y2) {
        // y = mx + b
        if (x2-x1 == 0)
            return new Equation(1, 0, x1);
        // find the slope first (m)
        double slope = (y2-y1)/(x2-x1);
        // use one of the points to find b
        double b = y1 - slope*x1;
        // remember that Equation class expect an equation of type ax + by = c
        return new Equation(slope, -1, -b);
    }
}
