/*
* It's appropriate to inherit from Number Abstract Base Class
* Number is the root class for numeric wrapper classes
* Implement Comparable interface since we can compare rational numbers
* */
public class Rational extends Number implements Comparable<Rational>{
    private final long numerator;
    private final long denominator;

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational(long nominator, long denominator) throws IllegalArgumentException {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be 0");
        // find the GCD of the absolute values of numerator and denominator
        // this way we can reduce the lowest terms
        long gcd = getGcd(Math.abs(nominator), Math.abs(denominator));
        // keep the denominator always positive
        // let the sign be represented in the nominator
        this.numerator = (denominator > 0 ? 1 : -1) * nominator / gcd;
        this.denominator = Math.abs(denominator)/gcd;
    }
    /*
    * Euclid formula
    * Let's consider 9 and 12
    * 1) 3 and 9
    * 2) 0 and 3
    * 3) return 3
    * */
    public static long getGcd(long a, long b) {
        if (a == 0)
            return b;
        return getGcd(b%a, a);
    }

    public Rational() {
        this(0, 1);
    }
    public Rational add(Rational other) {
        long d = getDenominator() * other.getDenominator();
        long n = getNumerator()* other.getDenominator() + getDenominator() * other.getNumerator();
        return new Rational(n, d);
    }
    public Rational subtract(Rational other) {
        long d = getDenominator() * other.getDenominator();
        long n = getNumerator()* other.getDenominator() - getDenominator() * other.getNumerator();
        return new Rational(n, d);
    }
    public Rational multiply(Rational other) {
        long n = getNumerator() * other.getNumerator();
        long d = getDenominator() * other.getDenominator();
        return new Rational(n, d);
    }
    public Rational divide (Rational other) {
        long n = getNumerator() * other.getDenominator();
        long d = getDenominator() * other.getNumerator();
        return new Rational(n, d);
    }
    @Override
    public String toString() {
        if (denominator == 1)
            return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational) {
            return this.compareTo((Rational) obj) == 0;
        }
        return false;
    }

    @Override
    public int compareTo(Rational o) {
        Rational difference = this.subtract(o);
        if (difference.getNumerator() > 0)
            return 1;
        else if (difference.getNumerator() < 0)
            return -1;
        return 0;
    }

    @Override
    public int intValue() {
        return (int) this.doubleValue();
    }

    @Override
    public long longValue() {
        return (long) this.doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
