public class VarArgsDemo {
    public static void main(String[] args) {
        printNegativeOnly(1, 2, 3, -2, -3, 4, -6);
    }

    public static void printNegativeOnly(double ... numbers) {
        for(double number : numbers)
            if (number < 0)
                System.out.print(number + " ");
        System.out.println();
    }
}
