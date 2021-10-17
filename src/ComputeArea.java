import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = scanner.nextDouble();
        area = Math.pow(radius, 2) * Math.PI;
        System.out.println("Area for radius " + radius + " is " + area);
    }
}
