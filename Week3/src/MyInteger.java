import java.util.Arrays;
import java.util.Objects;

public class MyInteger {
    private int value;
    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private static boolean checkForOdd(int value) {
        return value % 2 != 0;
    }

    public boolean isOdd() {
        return checkForOdd(this.value);
    }

    private static boolean checkForEven(int value) {
        return value % 2 == 0;
    }

    public boolean isEven() {
        return checkForEven(this.value);
    }
    private static boolean checkForPrime(int value) {
        // Fermat's little theorem
        // a^(n-1) % n = 1    if n is prime where 1 <= a < n
        for (int i = 1; i < value; i++) {
            if (Math.pow(i, value-1) % value != 1)
                return false;
        }
        return true;
    }
    public boolean isPrime() {
        return checkForPrime(this.value);
    }
    public static boolean isOdd(int value) {
        return checkForOdd(value);
    }
    public static boolean isOdd(MyInteger myInteger) {
        return checkForOdd(myInteger.getValue());
    }
    public static boolean isEven(int value) {
        return checkForEven(value);
    }
    public static boolean isEven(MyInteger myInteger) {
        return checkForEven(myInteger.getValue());
    }
    public static boolean isPrime(int value) {
        return checkForPrime(value);
    }
    public static boolean isPrime(MyInteger myInteger) {
        return checkForPrime(myInteger.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }
    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }
    public static int parseInt(char[] string) {
        int length = string.length;
        boolean isNeg = length > 0 && string[0] == '-';
        if (isNeg)
            string[0] = '0';
        int totalValue = 0;
        for (int i = 0; i < length; i++) {
            int charNumericValue = string[i];
            int digit = charNumericValue - 48;
            totalValue += Math.pow(10, length - i - 1) * digit;
        }
        return isNeg? -totalValue : totalValue;
    }
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
