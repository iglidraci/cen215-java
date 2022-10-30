public class Scoping {
    static int x = 8; // global
    public static void main(String[] args) {
        System.out.println(x);
        foo();
        System.out.println(x);
        bar();
        System.out.println(x);
        /*
        * Find the output
        * */
    }
    public static void bar() {
        x = 7;
        System.out.println(x--);
    }

    public static void foo() {
        int x = 3;
        System.out.println(++x);
    }
}
