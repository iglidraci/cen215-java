public class MyMath {
    public static void main(String[] args) {
        double res = power(3, 3);
        double res2 = power(4, -2);
        System.out.println(res + ", " + res2);
        nPrintln("****", 5);
    }

    public static double power(int base, int exp) {
        double res = 1;
        for (int i = 0; i < Math.abs(exp); i++) {
            res *= base;
        }
        if (exp < 0) return 1/res;
        else return res;
    }

    public static void nPrintln(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
