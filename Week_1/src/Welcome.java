/**
 * This is a simple class to demo a simple Hello world in Java
 * We only have the main method which prints out "Hello world"
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.time.LocalDate;
public class Welcome {

    public static void main(String[] args) {
        System.out.printf("");
        System.out.println("Hello world");
        JOptionPane.showMessageDialog(null, "Whats upp?!", "Tell us", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Are you there?", "Simple Question", JOptionPane.INFORMATION_MESSAGE);
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String in1 = scanner.next();
        int in2 = scanner.nextInt();
        System.out.println("Input 1 is " + in1);
        System.out.println("Input 2 is "+in2);
        float f = 2.555e3F;
        System.out.println("float f="+f);
        char a = 'a';
        System.out.println("a="+(a++));
        System.out.println("b=" + a);
        String inputStr = JOptionPane.showInputDialog(null, "Birth year:", "Enter the year you were born", 
                JOptionPane.QUESTION_MESSAGE);
        int bornYear = Integer.parseInt(inputStr);
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - bornYear;
        inputStr = JOptionPane.showInputDialog(null, "Birth month:", "Enter the month you were born",
                JOptionPane.QUESTION_MESSAGE);
        int bornMonth = Integer.parseInt(inputStr);
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth >= bornMonth)
            age++;
        System.out.println("Your age is:"+age);
    }
}

