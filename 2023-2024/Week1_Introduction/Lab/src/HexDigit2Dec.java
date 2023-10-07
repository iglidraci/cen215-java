import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        char hexDigit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter e hexadecimal digit: ");
        String input = scanner.nextLine();
        if(input.length() != 1) {
            System.out.println("Enter exactly one character");
            System.exit(1);
        }
        hexDigit = Character.toUpperCase(input.charAt(0));
        if(hexDigit >= 'A' && hexDigit <= 'F') {
            int digit = hexDigit - 'A' + 10;
            System.out.println(hexDigit + " -> " + digit);
        } else if (Character.isDigit(hexDigit)) {
            System.out.println(hexDigit + " -> " + hexDigit);
        } else {
            System.out.println("Wrong character");
        }
    }
}
