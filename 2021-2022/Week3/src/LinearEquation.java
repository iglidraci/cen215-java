import java.security.InvalidAlgorithmParameterException;

public class LinearEquation {
    private final Equation eq1;
    private final Equation eq2;

    public Equation getEq1() {
        return eq1;
    }

    public Equation getEq2() {
        return eq2;
    }

    public LinearEquation(Equation eq1, Equation eq2) {
        this.eq1 = eq1;
        this.eq2 = eq2;
    }

    public boolean isSolvable() {
        return getDenominator() != 0;
    }
    private double getDenominator() {
        return (eq1.getA() * eq2.getB() - eq1.getB()*eq2.getA());
    }
    public double getX() throws InvalidAlgorithmParameterException {
        if (!isSolvable()) {
           throw new InvalidAlgorithmParameterException("Equation is not solvable");
        }
        return (eq1.getC()*eq2.getB() - eq1.getB()*eq2.getC())/getDenominator();
    }

    public double getY() throws InvalidAlgorithmParameterException {
        if (!isSolvable()) {
            throw new InvalidAlgorithmParameterException("Equation is not solvable");
        }
        return (eq1.getA()*eq2.getC() - eq1.getC()*eq2.getA())/getDenominator();
    }
}
