public class Main {
    public static void main(String[] args) {
//        displayPattern(20);
//        int[] numbers = {1, 2, 3};
//        System.out.println(average(numbers));
//        largestRowAndColumn(4);
        studentGrades();
//        for (char letter = 'a'; letter <= 'd'; letter++)
//            drawPatterns(letter, 9);
//        drawDiamond(9);
    }
    // EX2
    public static void displayPattern(int n) {
        for (int i=1; i<=n; i++) {
            // take all the numbers from the last one down to the current number (exclude the current number)
            for (int k=n; k>i; k--) {
                // find the number of digits in each number
                int kLength = String.valueOf(k).length();
                // print whitespace for each digit of the number
                System.out.print(" ".repeat(kLength));
                // print a whitespace to separate digits from each other
                System.out.print(" ");
            }
            // print numbers now from the current number down to number 1
            for (int j=i; j>=1; j--)
                System.out.print(j + " ");
            System.out.println();
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

    // EX 8
    public static void largestRowAndColumn(int size) {
        int [][] matrix = randomMatrix(size);
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

    private static int[][] randomMatrix(int size) {
        int [][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.random() >= 0.5 ? 1 : 0;
            }
        }
        return matrix;
    }
    private static int getIndexOfMax(int[] array) {
        if(array.length == 0) return -1;
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
    public static void studentGrades() {
        String[] students = {"Jack", "Robert", "Edward", "Eddie"};
        String[] courses = {"Biology", "Algebra", "Physics", "Chemistry", "History"};
        int[][] grades = buildRandomGrades(students.length, courses.length);
        double[] averages = calculateAverage(grades);
        printStudents(students, courses, grades, averages);
        sortByAverage(students, grades, averages);
        printStudents(students, courses, grades, averages);
    }
    public static int[][] buildRandomGrades(int numberOfStudents, int numberOfCourses) {
        int[][] grades = new int[numberOfStudents][numberOfCourses];
        for(int i=0; i<numberOfStudents; i++)
            for (int j=0; j<numberOfCourses; j++)
                grades[i][j] = getRandomInt(40, 100);
        return grades;
    }

    // return a random integer from the given boundaries
    public static int getRandomInt(int min, int max) {
        return (int)(Math.random()*(max - min + 1) + min);
    }
    public static void printStudents(String[] students, String[] courses,
                                     int[][] grades, double[] averages) {
        for (int i=0; i<students.length; i++) {
            if (i == 0) {
                System.out.printf("%-15s|%-2s", "", "");
                for (String subject : courses) System.out.printf("%-15s|%-2s", subject, "");
                System.out.printf("%-15s|\n", "Average");
            }
            System.out.printf("%-15s|%-2s", students[i], "");
            for (int j=0; j<courses.length; j++) {
                System.out.printf("%-15d|%-2s", grades[i][j], "");
            }
            System.out.printf("%-15.2f|\n", averages[i]);
        }
    }
    // insertion sort based on average
    public static void sortByAverage(String[] students, int[][] grades, double[] averages) {
        for(int i=1; i<averages.length; i++) {
            double key = averages[i];
            int j = i-1;
            String student = students[i];
            int[] studentGrades = grades[i];
            while(j>=0 && averages[j]>key) {
                averages[j+1] = averages[j];
                students[j+1] = students[j];
                grades[j+1] = grades[j];
                j--;
            }
            averages[j+1] = key;
            students[j+1] = student;
            grades[j+1] = studentGrades;
        }
    }
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
    public static void circleOverlapTest(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        if (Math.abs(r1-r2) >= distance) {
            System.out.println("Circles are inside one another");
        } else if (r1 + r2 >= distance){
            System.out.println("Circles overlap");
        } else {
            System.out.println("circles do not overlap and they are not inside one another");
        }
    }

    // EX 17
    public static void drawPatterns(char callPattern, int nr) {
        switch (callPattern) {
            case 'a': drawPatternA(nr); break;
            case 'b': drawPatternB(nr); break;
            case 'c': drawPatternC(nr); break;
            case 'd': drawPatternD(nr); break;
            default: System.out.println("Wrong char!");
        }
    }

    private static void drawPatternD(int nr) {
        System.out.println("Pattern D");
        for (int i = nr; i >= 1 ; i--) {
            System.out.print("  ".repeat(nr - i));
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
            System.out.print("  ".repeat(nr - i));
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
        int emptySpaces = (nr - i) * 2;
        System.out.print(" ".repeat(emptySpaces));
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        for (int k = i - 1; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.print(" ".repeat(emptySpaces));
        System.out.println();
    }

}
