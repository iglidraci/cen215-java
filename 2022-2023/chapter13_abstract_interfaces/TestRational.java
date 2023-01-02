public class TestRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(2, 4);
        System.out.println(r1.equals(r2));
        System.out.println(r1 + ", " + r2);
        System.out.println(r1.add(r2));
        System.out.println(r1.add(r1).add(r1));
    }
}
