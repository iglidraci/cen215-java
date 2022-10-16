import java.util.Scanner;

public class CommonError {
    public static void main (String[] args) {
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        if (radius >= 0);
        {
          area = radius * radius * Math.PI;
          System.out.println( "Area = " + area);
        }
    }
}
