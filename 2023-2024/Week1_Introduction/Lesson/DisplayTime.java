import java.util.*;

public class DisplayTime {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds, minutes, remainder;
        System.out.print("Enter the number of seconds: ");
        seconds = scanner.nextInt();
        minutes = seconds / 60;
        remainder = seconds % 60;
        System.out.println(seconds + " seconds are " + minutes +
                    " minutes and " + remainder + " seconds");
    }
}
