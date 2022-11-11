import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input to test palindrome: ");
        String input = scanner.next();
        boolean isPalindrome = isPalindrome(input); // same name as the method
        System.out.println("String is " + (isPalindrome ? "" : "not ") + "palindrome");
    }

    public static boolean isPalindrome(String input) {
        String s1 = filterNonAlphanumeric(input);
        String s2 = reverse(s1);
        return s1.equals(s2);
    }

    private static String reverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        return builder.toString();
    }

    private static String filterNonAlphanumeric(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i)))
                builder.append(input.charAt(i));
        }
        return builder.toString();
    }
}
