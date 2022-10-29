public class Basics {
    public static void main(String[] args) {
        final int ROWS = 5;
        final int COLS = 5;
        int[][] image = new int[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                image[i][j] = (int) (Math.random() * 6);
            }
        }
        // ragged arrays
        int [][] studentsGrades = {
                {10, 9, 9, 8},
                {8, 7, 10},
                {8, 9}
        };
        print2DArray(studentsGrades);
        int[][][] rgbImage = new int[3][4][5];
        // find the output
        System.out.println(rgbImage[1].length);
        System.out.println(rgbImage[2][3].length);
        System.out.println(rgbImage[0][4].length);
    }

    public static void print2DArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
