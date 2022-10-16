public class MyInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyInteger(int value) {
        this.value = value;
    }
    private static boolean _isEven(int value) {
        return value%2 == 0;
    }
    private static boolean _isOdd(int value) {
        return value%2 != 0;
    }
    private static boolean _isPrime(int value) {
        // Fermat's little theorem
        // a^(n-1) % n = 1    if n is prime where 1 <= a < n
        for (int i = 1; i < value; i++) {
            if (Math.pow(i, value-1) % value != 1)
                return false;
        }
        return true;
    }
    public boolean isOdd() {
        return _isOdd(this.value);
    }
    public boolean isEven() {
        return _isEven(this.value);
    }
    public boolean isPrime() {
        return _isPrime(this.value);
    }
    public static boolean isOdd(int value) {
        return _isOdd(value);
    }
    public static boolean isEven(int value) {
        return _isEven(value);
    }
    public static boolean isPrime(int value) {
        return _isPrime(value);
    }
    public static boolean isEven(MyInteger obj) {
        return _isEven(obj.getValue());
    }
    public static boolean isOdd(MyInteger obj) {
        return _isEven(obj.getValue());
    }
    public static boolean isPrime(MyInteger obj) {
        return _isPrime(obj.getValue());
    }
    public boolean equals(int value) {
        return this.value == value;
    }
    public boolean equals(MyInteger obj) {
        return this.value == obj.getValue();
    }
    public static int parseInt(char[] array) {
        return Integer.parseInt(String.valueOf(array));
    }
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
