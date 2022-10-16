import java.util.Arrays;

public class TestRational {
    public static void main(String[] args) {
        // Rational class can easily overflow
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);
        Rational r3 = new Rational(4, 9);
        Rational r4 = new Rational(5, 3);
        Rational r5 = new Rational(7, 2);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r1 + " = " + r1.doubleValue());
        System.out.println(r2 + " = " + r2.doubleValue());
        System.out.println(r1 + " == " + r2 + " -> " + (r1.equals(r2)));
        Rational[] rationals = {r1, r2, r3, r4, r5};
        System.out.println("Before sorting: ");
        for(Rational r: rationals)
            System.out.print(r + " ");
        System.out.println();
        Arrays.sort(rationals);
        System.out.println("After sorting: ");
        for(Rational r: rationals)
            System.out.print(r + " ");
        System.out.println();
    }
}
