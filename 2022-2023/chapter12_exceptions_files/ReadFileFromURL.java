import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL");
        String path = new Scanner(System.in).next();
        try {
            URL url = new URL(path);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                count += input.nextLine().length();
            }
            System.out.println("file size is " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("invalid url");
        } catch (IOException ex) {
            System.out.println("no such file");
        }
    }
}
