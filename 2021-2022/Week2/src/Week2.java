import jdk.jshell.spi.ExecutionControl;

import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.Random;

public class Week2 {
    private static final HashMap<Integer, Long> factorialCache = new HashMap<>();
    private static int getPentagonalNumber(int n) {
        return n*(3*n-1)/2;
    }
    // EX 1
    public static void printPentagonalNumbers(int n) {
        for (int i=1; i<=n; i++) {
            int nr = getPentagonalNumber(i);
            System.out.print(nr + " ");
            if (i%10 == 0)
                System.out.println();
        }
    }
    // EX2
    public static void displayPattern(int n) {
        for (int i=1; i<=n; i++) {
            // take all the numbers from the last one down to the current number (exclude the current number)
            for (int k=n; k>i; k--) {
                // find the number of digits in each number
                int kLength = String.valueOf(k).length();
                // print whitespace for each digit of the number
                for(int l=0; l<kLength; l++)
                    System.out.print(" ");
                // print a whitespace to separate digits from each other 
                System.out.print(" ");
            }
            // print numbers now from the current number down to number 1
            for (int j=i; j>=1; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    // EX 5
    public static void reversePrintArray(int[] array) {
        for(int i=array.length -1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
    // EX 6
    public static int average(int[] array) {
        if (array.length == 0)
            return 0;
        int sum = 0;
        for (int j : array) sum += j;
        return sum/array.length;
    }
    public static double average(double[] array) {
        if (array.length == 0)
            return 0;
        double sum = 0.;
        for (double v : array) sum += v;
        return sum/array.length;
    }
    // EX 7
    public static boolean equal(int[] list1, int[] list2) {
        if (list1.length != list2.length)
            return false;
        int size = list1.length;
        for (int i = 0; i < size; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
    // EX 8
    public static void randomMatrix(int size) {
        int [][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextBoolean() ? 1 : 0;
            }
        }
        int[] rows = new int[size];
        int[] columns = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 1){
                    columns[j]++;
                    rows[i]++;
                }
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        int r = getIndexOfMax(rows);
        int c = getIndexOfMax(columns);
        System.out.println("Row with most ones is: " + r);
        System.out.println("Column with most ones is: " + c);
    }

    private static int getIndexOfMax(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    // EX 9
    public static int[][] buildRandomGrades(int cols, int rows) {
        Random random = new Random();
        int[][] grades = new int[rows][cols];
        for(int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                grades[i][j] = random.nextInt(61) + 40;
        return grades;
    }
    // part of EX 9
    public static void printStudents(String[] names, String[] subjects,
                                    int[][] grades, double[] averages) {
        for (int i=0; i<names.length; i++) {
            if (i == 0) {
                System.out.printf("%-20s", "");
                for (String subject : subjects) System.out.printf("%-20s", subject);
                System.out.printf("%-20s\n", "Average");
            }
            System.out.printf("%-20s", names[i]);
            for (int j=0; j<subjects.length; j++) {
                System.out.printf("%-20d", grades[i][j]);
            }
            System.out.printf("%-20.2f\n", averages[i]);
        }
    }
    // insertion sort based on average
    public static void sort(String[] names, int[][] grades, double[] averages) {
        for(int i=1; i<averages.length; i++) {
            double key = averages[i];
            int j = i-1;
            String student = names[i];
            int[] studentGrades = grades[i];
            while(j>=0 && averages[j]>key) {
                averages[j+1] = averages[j];
                names[j+1] = names[j];
                grades[j+1] = grades[j];
                j--;
            }
            averages[j+1] = key;
            names[j+1] = student;
            grades[j+1] = studentGrades;
        }
    }
    // part of EX 9
    public static double[] calculateAverage(int[][] grades) {
        int numStudents = grades.length;
        int numGrades = numStudents == 0 ? 0 : grades[0].length;
        double[] averages = new double[numStudents];
        double sum;
        for(int i=0; i < numStudents; i++){
            sum = 0.;
            for (int j=0; j<numGrades; j++){
                sum += grades[i][j];
            }
            averages[i] = sum/numGrades;
        }
        return averages;
    }

    // EX 10
    public static int max(int... n) {
        int maxValue = Integer.MIN_VALUE;
        for(int i: n) maxValue = Math.max(i, maxValue);
        return maxValue;
    }

    // EX 16
    static void circleOverlapTest(Circle c1, Circle c2) {
        double x1 = c1.getX();
        double y1 = c1.getY();
        double r1 = c1.getRadius();
        double x2 = c2.getX();
        double y2 = c2.getY();
        double r2 = c2.getRadius();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        if (Math.abs(r1-r2) >= distance) {
            System.out.println("Circles are inside one another");
        } else if (r1 + r2 >= distance){
            System.out.println("Circles overlap");
        } else {
            System.out.println("circles do not overlap and they are not inside one another");
        }
    }
    public static void drawPatterns(char callPattern, int nr) {
        switch (callPattern) {
            case 'a' -> drawPatternA(nr);
            case 'b' -> drawPatternB(nr);
            case 'c' -> drawPatternC(nr);
            case 'd' -> drawPatternD(nr);
            default -> System.out.println("Wrong char!");
        }
    }

    private static void drawPatternD(int nr) {
        System.out.println("Pattern D");
        for (int i = nr; i >= 1 ; i--) {
            printEmptySpaces(nr-i);
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    private static void drawPatternC(int nr) {
        System.out.println("Pattern C");
        for (int i = 1; i <= nr ; i++) {
            printEmptySpaces(nr-i);
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    private static void drawPatternB(int nr) {
        System.out.println("Pattern B");
        for (int i = nr; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j==i) {
                    System.out.println();
                }
            }
        }
        System.out.println("----------------");
    }

    private static void drawPatternA(int nr) {
        System.out.println("Pattern A");
        for (int i = 1; i <= nr; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j==i) {
                    System.out.println();
                }
            }
        }
        System.out.println("----------------");
    }
    public static double computeERec(int i) {
        double e = 1.;
        for (int j = 1; j <= i; j++) {
            long factorial = factorial(j);
            e += factorial > 0 ? (1. / factorial) : 0;
        }
        return e;
    }

    public static double computeE(int i) {
        double e = 1.;
        int counter = 1;
        double factorial = 1;
        while (counter <= i) {
            factorial *= counter;
            factorial = factorial > 0 ? factorial : Double.MAX_VALUE;
            e += 1/factorial;
            counter += 1;
        }
        return e;
    }


    private static long factorial(int nr) {
        if (nr <= 1)
            return 1;
        if (factorialCache.containsKey(nr))
            return factorialCache.get(nr);
        long result = nr * factorial(nr-1);
        factorialCache.put(nr, result);
        return result;
    }

    public static void drawDiamond(int nr) {
        // make sure no nr is greater than 10
        nr = nr % 10;
        // draw the upper part of the diamond
        for (int i = 1; i <= nr ; i++) {
            drawDiamondPart(nr, i);
        }
        // draw the lower part of the diamond
        for (int i = nr-1; i >= 1 ; i--) {
            drawDiamondPart(nr, i);
        }

    }

    private static void drawDiamondPart(int nr, int i) {
        int emptySpaces = nr - i;
        printEmptySpaces(emptySpaces);
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        for (int k = i - 1; k >= 1; k--) {
            System.out.print(k + " ");
        }
        printEmptySpaces(emptySpaces);
        System.out.println();
    }

    private static void printEmptySpaces(int priorNumbers) {
        for (int i = 1; i <= priorNumbers; i++) {
            // we suppose that we take one space for the number and one for backspace
            System.out.print("  ");
        }
    }
    // extra exercise
    // find the fibonacci number at a certain position
    public static long fibonacciNumberAt(int position, int firstNumber, int secondNumber) throws InvalidAlgorithmParameterException {
        return getFibonacciNumber(position, firstNumber, secondNumber);
    }

    private static long getFibonacciNumber(int position, long firstNumber, long secondNumber) throws InvalidAlgorithmParameterException {
        if (position < 1)
            throw new InvalidAlgorithmParameterException("Position should be greater or equal to 1");
        else if (position == 1)
            return firstNumber;
        else if (position == 2)
            return secondNumber;
        else {
            int counter = 3;
            long nextNumber = 0;
            while (counter <= position) {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
                counter++;
            }
            return nextNumber;
        }
    }

    public static long fibonacciNumberAt(int position) throws InvalidAlgorithmParameterException {
        return getFibonacciNumber(position, 1, 1);
    }
    public static long fibonacciNumberAtRecursively(int position) {
        return getFibonacciNumberRec(position, 1, 1);
    }
    public static long fibonacciNumberAtRecursively(int position, int firstNumber, int secondNumber){
        return getFibonacciNumberRec(position, firstNumber, secondNumber);
    }

    private static long getFibonacciNumberRec(int position, long firstNumber, long secondNumber) {
        // implement it here
        return 1;
    }
}

