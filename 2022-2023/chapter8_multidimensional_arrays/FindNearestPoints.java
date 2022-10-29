import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int nrOfPoints = scanner.nextInt();
        // create a matrix to store points (x, y)
        double[][] points = new double[nrOfPoints][2];
        System.out.println("Enter the coordinates for each point");
        for (int i = 0; i < nrOfPoints; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        int p1 = 0, p2 = 1; // initial two points
        // suppose that the first two points are the nearest of all
        double shortestDistance = getDistance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        // calculate all the distances
        for (int i = 0; i < nrOfPoints; i++) {
            for (int j = i + 1; j < nrOfPoints; j++) {
                double distance = getDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.printf("Nearest points are: (%.1f, %.1f) and (%.1f, %.1f)\n", points[p1][0], points[p1][1],
                            points[p2][0], points[p2][1]);
    }

    private static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2));
    }
}
