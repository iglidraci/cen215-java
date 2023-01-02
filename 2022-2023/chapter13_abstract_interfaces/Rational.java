public class Rational extends Number implements Comparable<Rational>{
    private final long numerator;
    private final long denominator;
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (numerator > 0 ? 1 : -1) * numerator / gcd; // we will keep the sign in the numerator
        this.denominator = Math.abs(denominator) / gcd; // denominator will always be positive
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    private static long gcd(long a, long b) {
        long gcd = 1;
        long nr1 = Math.abs(a); long nr2 = Math.abs(b);
        for (int i = 1; i <= Math.min(nr1, nr2); i++) {
            if (nr1 % i == 0 && nr2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public Rational add(Rational anotherRational) {
        long num = this.numerator * anotherRational.getDenominator() + anotherRational.getNumerator() * this.denominator;
        long den = this.denominator * anotherRational.getDenominator();
        return new Rational(num, den);
    }

    public Rational subtract(Rational anotherRational) {
        long num = this.numerator * anotherRational.getDenominator() - anotherRational.getNumerator() * this.denominator;
        long den = this.denominator * anotherRational.getDenominator();
        return new Rational(num, den);
    }

    public Rational multiply (Rational anotherRational) {
        long num = this.numerator * anotherRational.getNumerator();
        long den = this.denominator * anotherRational.getDenominator();
        return new Rational(num, den);
    }

    public Rational divide (Rational anotherRational) {
        long num = this.numerator * anotherRational.getDenominator();
        long den = this.denominator * anotherRational.getNumerator();
        return new Rational(num, den);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return "" + numerator;
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Rational) {
            return subtract((Rational) other).getNumerator() == 0;
        }
        return false;
    }

    @Override
    public int compareTo(Rational o) {
        Rational res = subtract(o);
        if (res.getNumerator() > 0) return 1;
        else if (res.getNumerator() == 0) return 0;
        return -1;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return 1. * numerator / denominator;
    }
}
