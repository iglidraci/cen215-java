import javax.swing.JOptionPane;

public class Welcome {
  public static void main (String[] args) {
    System.out.println("Welcome to CEN 215, Object Oriented Programming");
    JOptionPane.showMessageDialog(null, "Welcome to OOP",
                                  "Title", JOptionPane.INFORMATION_MESSAGE);
  }
}
