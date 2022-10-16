import java.util.Scanner;

public class Selections {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        boolean isEven = (nr % 2 == 0);

        System.out.println("Number you entered is " + ((isEven) ? "even" : "odd"));

    }
}
