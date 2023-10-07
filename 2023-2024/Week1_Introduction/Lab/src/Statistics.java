import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        int sum = 0, pos = 0, neg = 0, next;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The input ends if one of the numbers is 0");
        do {
            next = scanner.nextInt();
            if (next > 0) pos++;
            else if (next < 0) neg++;
            sum += next;
        } while (next != 0);
        if(sum == 0)
            System.out.println("No numbers were entered except zero");
        else {
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.printf("The average is %.2f\n", (float)sum/(pos + neg));
            System.out.println("The sum is " + sum);
        }
    }
}
