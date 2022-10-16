import javax.swing.*;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello World how are ya");
        String inputNumber = JOptionPane.showInputDialog(null, "Insert a number",
        "Check if it is even or not", JOptionPane.QUESTION_MESSAGE);
        int number = Integer.parseInt(inputNumber);
        boolean b = number%2 == 0;
        String s = (b) ? "even" : "odd";
        System.out.printf("Number %d is %s", number, s);
    }
}
