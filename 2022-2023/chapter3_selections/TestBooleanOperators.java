import javax.swing.JOptionPane;

public class TestBooleanOperators {
    public static void main (String[] args) {
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        if (nr % 2 == 0 && nr % 3 == 0)
            System.out.println(nr + " is divisible by 2 and 3");
        if (nr % 2 == 0 || nr % 3 == 0)
            System.out.println(nr + " is divisible by 2 or 3");
        if (nr % 2 == 0 ^ nr % 3 == 0)
            System.out.println(nr + " is divisible by 2 or 3 but not both");
    }
}
