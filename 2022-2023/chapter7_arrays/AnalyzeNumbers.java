import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int size = scanner.nextInt();
        double[] elements = new double[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextDouble();
        }
        double sum = 0;
        for(double element : elements)
            sum += element;
        double avg = sum / size;
        int greaterThanAvg = 0;
        for(double element : elements)
            if (element > avg)
                greaterThanAvg++;
        System.out.println("Average: " + avg);
        System.out.println("Total number of elements greater than average: " + greaterThanAvg);
    }
}
