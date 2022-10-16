
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = (int) (Math.random() * 100);
        System.out.println("The lottery secret is " + guess + ". Pretend you didn't see anything");
        System.out.println("Enter you lottery pick: ");
        int lotteryNr = scanner.nextInt();
        int guessNr1 = guess / 10;
        int guessNr2 = guess % 10;
        int lotteryNr1 = lotteryNr / 10;
        int lotteryNr2 = lotteryNr % 10;
        if (guess == lotteryNr) {
            System.out.println("You won $1000");
        } else if (guessNr1 == lotteryNr2 && guessNr2 == lotteryNr1) {
            System.out.println("You won $300");
        } else if (guessNr1 == lotteryNr1 || guessNr1 == lotteryNr2 || guessNr2 == lotteryNr1 || guessNr2 == lotteryNr2) {
            System.out.println("You won $100");
        } else {
            System.out.println("You didn't win anything");
        }
    }
}
