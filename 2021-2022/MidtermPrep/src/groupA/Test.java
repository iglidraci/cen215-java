package groupA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        // Has Only Letters and 2 numbers
        System.out.println("1aa2Z".matches("[a-zA-Z]*\\d[a-zA-Z]*\\d[a-zA-Z]*"));
        // date format
        System.out.println("11/12/1998".matches("\\d\\d?/\\d\\d?/\\d{4}"));
        System.out.println("1998-13-31".matches("^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$"));
        System.out.println("02-12-1998".matches("[\\d{2}][\\d{2}]\\d{4}"));
        System.out.println("2-12-1998".matches("\\d{1,2}-\\d{1,2}-\\d{4}"));
        System.out.println("here " + "112-12-1998".matches("(\\d{2}|\\d)-(\\d{2}|\\d)-\\d{4}"));
        // phone format +355 dd ddd ddd
        System.out.println("+355 45 909 428".matches("\\+355\\s\\d{2}\\s\\d{3}\\s\\d{3}"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("test.txt"));
        bf.write("hello");
        bf.close();
        sum(1, 2);
    }
    public static void sum(int ... numbers) {
        int s = 0;
        for (int i: numbers)
            s += i;
        if (numbers.length == 1) {
            System.out.println("The sum is " + s);
        } else {
            String[] temp = new String[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = String.valueOf(numbers[i]);
            }
            String res = String.join(", ", Arrays.copyOfRange(temp, 0, temp.length - 1));
            System.out.println("The sum of " + res + " and " + temp[temp.length - 1] + " is " + s);
        }
    }
}
