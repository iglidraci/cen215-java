import java.util.Scanner;

public class SimpleString {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("Length of the string: " + str.length());
        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(str.length() - 1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str1 = " String ";
        String str2 = " Methods ";
        String str3 = str1.trim() + str2.trim();
        System.out.println(str3);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
    }
}
