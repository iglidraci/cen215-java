import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println("s1 == s2 ? " + (s1 == s2));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first student: ");
        String student1 = scanner.nextLine();
        System.out.print("Enter the second student: ");
        String student2 = scanner.nextLine();
        if (student1.compareTo(student2) < 0) {
            System.out.println("The students in alphabetical order are: " + student1 + " " + student2);
        } else {
            System.out.println("The students in alphabetical order are: " + student2 + " " + student1);
        }
    }
}
