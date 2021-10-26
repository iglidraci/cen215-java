import javax.swing.JOptionPane;
import java.util.Scanner;
public class TestWeek2 {
    public static void main(String[] args) {
         String penNumbers = JOptionPane.showInputDialog("Enter the number of pentagonal numbers");
         Week2.printPentagonalNumbers(Integer.parseInt(penNumbers));
         System.out.println();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number which you want to create a pattern from:");
         int patternNumber = scanner.nextInt();
         Week2.displayPattern(patternNumber);
         // let's use args to enter ten numbers and print them in reversed order that were entered
         int[] argsArray = new int[args.length];
         for (int i=0; i<args.length; i++)
             argsArray[i] = Integer.parseInt(args[i]);
         Week2.reversePrintArray(argsArray);
         // use the same args array to average them
         int average = Week2.average(argsArray);
         System.out.printf("Average of the int array = %d\n", average);
         // hard code the array doubles
         double[] doubleArray = new double[] {1. , 4.5, 6.7, 9.8, 99.66};
         double doubleAverage = Week2.average(doubleArray);
         System.out.printf("Average of the double array = %.2f\n", doubleAverage);

         // read two arrays from terminal and check if they equal or not
         scanner = new Scanner(System.in).useDelimiter("\\n");
         System.out.println("Enter list1: ");
         String input1 = scanner.next();
         System.out.println("Enter list2: ");
         String input2 = scanner.next();
         String[] list1 = input1.split("\\s+");
         String[] list2 = input2.split("\\s+");
         int[] array1 = new int[list1.length];
         int[] array2 = new int[list2.length];
         for(int i=0; i<list1.length; i++)
             array1[i] = Integer.parseInt(list1[i]);
         for (int i=0; i < list2.length; i++)
             array2[i] = Integer.parseInt(list2[i]);
         boolean areEqual = Week2.equal(array1, array2);
         System.out.println("Two arrays that you entered are " +
         (areEqual ? "" : "not ") + "equal");

        Week2.randomMatrix(4);
        String[] students = new String[] {"Igli", "Ambra", "Desa"};
        String[] subjects = new String[] {"OOP", "Algorithms", "Data structures"};
        int[][] grades = Week2.buildRandomGrades(subjects.length, students.length);
        double[] averages = Week2.calculateAverage(grades);
        System.out.println("Students after initializing their grades");
        Week2.printStudents(students, subjects, grades, averages);
        Week2.sort(students, grades, averages);
        System.out.println("After sorting students according to their average");
        Week2.printStudents(students, subjects, grades, averages);
        System.out.println("Max=" + Week2.max(1,100, 56, 3, 45, 55));
        var c1 = new Circle(2., 1., 1.);
        var c2 = new Circle(0.9, 4., 4.);
        Week2.circleOverlapTest(c1, c2);
        Week2.drawPatterns('a', 9);
        Week2.drawPatterns('b', 9);
        Week2.drawPatterns('c', 9);
        Week2.drawPatterns('d', 9);
        int val = 10000000;
        double e = Week2.computeE(val);
        System.out.println("e computed over " + val + " = " + e);
        Week2.drawDiamond(9);
        scanner.close();
    }
}
