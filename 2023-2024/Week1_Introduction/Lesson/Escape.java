public class Escape {
    public static void main(String[] args) {
        System.out.println("Hello\bWorld");
        System.out.println("Hello\tJava");
        System.out.println("Hello\nWorld");
        for (int i=0; i < Math.pow(10, 10); i++) {
            System.out.print("" + i + "\r");
        }
    }
}
