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
    public boolean isOdd() {
        return MyInteger.isOdd(this.value);
    }
    public boolean isEven() {
        return MyInteger.isEven(this.value);
    }
    public boolean isPrime() {
        return MyInteger.isPrime(this.value);
    }
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    public static boolean isPrime(int value) {
        // Fermat's little theorem
        // a^(n-1) % n = 1    if n is prime where 1 <= a < n
        for (int i = 1; i < value; i++) {
            if (Math.pow(i, value - 1) % value != 1)
                return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger obj) {
        return MyInteger.isEven(obj.getValue());
    }
    public static boolean isOdd(MyInteger obj) {
        return MyInteger.isOdd(obj.getValue());
    }
    public static boolean isPrime(MyInteger obj) {
        return MyInteger.isPrime(obj.getValue());
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
}