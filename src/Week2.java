import java.util.Random;

public class Week2 {
    public static int getPentagonalNumber(int n) {
        return n*(3*n-1)/2;
    }
    public static void printPentagonalNumbers(int n) {
        for (int i=1; i<=n; i++) {
            int nr = getPentagonalNumber(i);
            System.out.print(nr + " ");
            if (i%10 == 0)
                System.out.println();
        }
    }
    /*
    func draw_pattern(nr):
    for i in range(1, nr+1, 1):
        for k in range(nr, i, -1):
            print(' '*len(str(k)) + ' ', end='')
        for j in range(i, 0, -1):
            print(f'{j} ', end='')
        print('')
    */
    public static void displayPattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int k=n; k>i; k--) {
                int kLength = String.valueOf(k).length();
                for(int l=0; l<kLength; l++)
                    System.out.print(" ");
                System.out.print(" ");
            }
            for (int j=i; j>0; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    public static void reversePrintArray(int[] array) {
        for(int i=array.length -1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
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
        for (int i = nr; i >= 1 ; i--) {
            printEmptySpaces(nr-i);
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void drawPatternC(int nr) {
        for (int i = 1; i <= nr ; i++) {
            printEmptySpaces(nr-i);
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void drawPatternB(int nr) {
        for (int i = nr; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j==i) {
                    System.out.println();
                }
            }
        }
    }

    private static void drawPatternA(int nr) {
        for (int i = 1; i <= nr; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                if (j==i) {
                    System.out.println();
                }
            }
        }
    }
    public static double computeE(int i) {
        double e = 1.;
        for (int j = 1; j <= i; j++) {
            e += (1. / factorial(j));
        }
        return e;
    }

    private static long factorial(int nr) {
        if (nr <= 1)
            return 1;
        return nr * factorial(nr-1);
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
}
