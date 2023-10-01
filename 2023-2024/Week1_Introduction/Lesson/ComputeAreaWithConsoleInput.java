import java.util.Scanner; // Scanner class is in the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main (String[] args) {
        final double PI = 3.14159;
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}
