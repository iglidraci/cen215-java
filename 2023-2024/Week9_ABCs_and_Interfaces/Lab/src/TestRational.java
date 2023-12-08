public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 10);
        Rational r2 = new Rational(2, 6);
        Rational r3 = new Rational(3, -596);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r2 + " - " + r3 + " = " + r2.subtract(r3).doubleValue());
        System.out.println("3.25 is " + Rational.convertDecimalToRational("3.25"));
        System.out.println("-0.45452 is " + Rational.convertDecimalToRational("-0.45452"));
    }
}
