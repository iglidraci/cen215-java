public class Rational extends Number implements Comparable<Rational>{
    private final long nominator;
    private final long denominator;

    public long getNominator() {
        return nominator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational(long nominator, long denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be 0");
        long gcd = getGcd(Math.abs(nominator), Math.abs(denominator));
        // keep the denominator always positive
        // let the sign be represented in the nominator
        this.nominator = (denominator > 0 ? 1 : -1) * nominator / gcd;
        this.denominator = Math.abs(denominator)/gcd;
    }

    public static long getGcd(long a, long b) {
        // euclid
        if (a == 0)
            return b;
        return getGcd(b%a, a);
    }

    public Rational() {
        this(0, 1);
    }
    public Rational add(Rational other) {
        long d = getDenominator() * other.getDenominator();
        long n = getNominator()* other.getDenominator() + getDenominator() * other.getNominator();
        return new Rational(n, d);
    }
    public Rational subtract(Rational other) {
        long d = getDenominator() * other.getDenominator();
        long n = getNominator()* other.getDenominator() - getDenominator() * other.getNominator();
        return new Rational(n, d);
    }
    public Rational multiply(Rational other) {
        long n = getNominator() * other.getNominator();
        long d = getDenominator() * other.getDenominator();
        return new Rational(n, d);
    }
    public Rational divide (Rational other) {
        long n = getNominator() * other.getDenominator();
        long d = getDenominator() * other.getNominator();
        return new Rational(n, d);
    }
    @Override
    public String toString() {
        if (denominator == 1)
            return String.valueOf(nominator);
        return nominator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rational) {
            Rational difference = this.subtract((Rational) obj);
            return difference.getNominator() == 0;
        }
        return false;
    }

    @Override
    public int compareTo(Rational o) {
        Rational difference = this.subtract(o);
        if (difference.getNominator() > 0)
            return 1;
        else if (difference.getNominator() < 0)
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
        return (double) nominator / denominator;
    }
}
