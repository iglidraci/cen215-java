import java.util.Scanner;

public class CommonError {
    public static void main (String[] args) {
        final double PI = 3.14;
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        /*
        Common Error 1: Forgetting Necessary Braces
        */
        if (radius >= 0)
            area = radius * radius * PI;
            System.out.println("The area is" + area);
        /*
        Common Error 2: Wrong Semicolon at the if Line
        */
        if (radius >= 0);
        {
          area = radius * radius * Math.PI;
          System.out.println( "Area = " + area);
        }
        /*
        Common Error 3: Redundant Testing of Boolean Values
        */
        boolean isEven = true;
        if (isEven == true)
            System.out.println("Number is even");

        /*
        Common Error 4: Dangling else Ambiguity
        */
        int i = 1, j = 2, k = 3;
        if (i > j)
            if (i > k)
                System.out.println("A");
        else
            System.out.println("B");

        /*
        Common Error 5: Equality Test of Two Floating-Point Values
        You already know this trick
        */
    }
}
