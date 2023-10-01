import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        int yearBorn = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?", "Age Calculator", JOptionPane.QUESTION_MESSAGE));
        int age = 2022 - yearBorn;
        System.out.println("Your age is " + age);
    }
}
