public final class Rational extends Number implements Comparable<Rational> {
    private final long numerator;
    private final long denominator;
    public Rational() {
        this(0);
    }
    public Rational(long nr) {
        this(nr, 1);
    }
    public Rational(long numerator, long denominator) {
        if(denominator == 0) throw new IllegalArgumentException("Denominator cannot be 0");
        long gcd = Rational.gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long a, long b) {
        long gcd = 1;
        long nr1 = Math.abs(a);
        long nr2 = Math.abs(b);
        long min = Math.min(nr1, nr2);
        for(int i = 1; i <= min; i++) {
            if(nr1 % i == 0 && nr2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        long newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        long newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        long newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        long newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        long newNumerator = this.numerator * other.numerator;
        long newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        long newNumerator = this.numerator * other.denominator;
        long newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rational other)
            return this.subtract(other).numerator == 0;
        return false;
    }

    @Override
    public String toString() {
        if(denominator == 1) return numerator + "";
        return numerator + "/" + denominator;
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
        return (double) numerator / denominator;
    }

    @Override
    public int compareTo(Rational o) {
        long n = this.subtract(o).getNumerator();
        if(n == 0) return 0;
        else if (n > 0) return 1;
        else return -1;
    }

    public static Rational convertDecimalToRational(String decimal) {
        int fractionalLength = decimal.split("\\.")[1].length();
        long denominator = Long.parseLong("1" + "0".repeat(fractionalLength));
        long numerator = (long)(Double.parseDouble(decimal) * denominator);
        return new Rational(numerator, denominator);
    }
}
