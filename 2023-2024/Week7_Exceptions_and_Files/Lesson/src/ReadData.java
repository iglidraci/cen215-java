import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws IOException {
        File file = new File("files/scores.txt");
        try(Scanner scanner = new Scanner(file)) { // will automatically close the resource
            while (scanner.hasNext()) {
                String name = scanner.next();
                int score = scanner.nextInt();
                System.out.println(name + " has " + score + " points");
            }
        }
    }
}
