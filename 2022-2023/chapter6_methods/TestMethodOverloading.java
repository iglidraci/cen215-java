public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println(myMax(1, 2));
        System.out.println(myMax(1, 2, 6));
        System.out.println(myMax(1.5, 2.6));
        System.out.println(myMax(1.5, 2.6, 7.8));
    }

    public static int myMax(int a, int b) {
        return a  > b ? a : b;
    }

    public static int myMax(int a, int b, int c) {
        return myMax(a, myMax(b, c));
    }

    public static double myMax(double a, double b) {
        return a  > b ? a : b;
    }

    public static double myMax(double a, double b, double c) {
        return myMax(a, myMax(b, c));
    }
    /*
    * Can you invoke myMax method with an int value and a double value? If so, which method is invoked?
    * Why max(1, 2) invokes the first method?
    * */
}
