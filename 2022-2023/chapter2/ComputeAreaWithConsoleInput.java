import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main (String[] args) {
        final double PI = 3.14;
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}
