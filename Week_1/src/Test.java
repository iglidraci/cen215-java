import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println("In math => 0.1 + 0.2 = 0.3");
        double res = 0.1 + 0.2;
        System.out.println("In Java => 0.1 + 0.2 = " + res);

        System.out.println("In math => 1. - 0.9 = 0.1");
        System.out.println("In math => 1. - 0.9 = " + (1. - .9));
        System.out.println("Hello \n\"World \bWar\"");
        int i = 'a';
        char ch = 'a' + 1;
        System.out.println(i);
        System.out.println(ch);
//        var input = JOptionPane.showInputDialog(null, "Hello Java", "Message", JOptionPane.WARNING_MESSAGE);
//        System.out.println("Input from JOptionPane is \t"+input);
        String welcome = "Welcome to CEN 215! Welcome!";
        welcome.replace("Welcome", "Intro");
        System.out.println(welcome);
        var title = "Calculate your age";
        var question = "What year were you born?";
        var ageInput = JOptionPane.showInputDialog(null, question, title,JOptionPane.QUESTION_MESSAGE);
        int year = Integer.parseInt(ageInput);
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        System.out.println("Your age is " + age);
        switch (age) {
            case 22:
                System.out.println("you are 22" );
            case 23:
                System.out.println("you are 23");
            default:
                System.out.println("Don't really know how old you are!");
        }
        System.out.printf("""
                %cd represents int like %d
                %c.2f represents floating point numbers with 2 decimal places like %.2f
                """, '%', 2, '%', 2.2222);
        int a;
        int b = 2;
        int c;
        a = b += c = 3;
        System.out.printf("c=%d\nb=%d\na=%d\n", c, b, a);
        System.out.println(a==b);
        var confirm = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        System.out.print("Confirm is "+confirm);
        double count = 1;
        double sum = 0;
        while (count !=0) {
            sum += count;
            count -= .1;
            System.out.printf("%.2f\n", count);
        }
        System.out.print("End");
    }
}
