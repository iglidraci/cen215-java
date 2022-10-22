import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 in case you want to stop");
        int nr, max;
        nr = scanner.nextInt();
        max = nr;
        while (nr != 0) {
            nr = scanner.nextInt();
            if (nr > max) max = nr;
        }
        System.out.println("Max is " + max);
        System.out.println("number is " + nr);
    }
}
