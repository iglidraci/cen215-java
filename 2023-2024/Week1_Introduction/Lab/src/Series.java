import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series with 5 numbers");
        String series = scanner.nextLine();
        if(series.length() != 5) {
            System.out.println("Series should contain exactly 5 numbers");
            System.exit(1);
        }
        final int ASC = 0, DESC = 1, CONST = 2, UNORDERED = 3;
        int compareResult = series.charAt(0) - series.charAt(1);
        int order;
        if(compareResult < 0)
            order = ASC;
        else if (compareResult > 0)
            order = DESC;
        else
            order = CONST;
        for (int i = 1; i < 4; i++) {
            compareResult = series.charAt(i) - series.charAt(i + 1);
            if(order == CONST && compareResult < 0)
                order = ASC;
            else if (order == CONST && compareResult > 0)
                order = DESC;
            else if (order == ASC && compareResult > 0)
                order = UNORDERED;
            else if (order == DESC && compareResult < 0)
                order = UNORDERED;

            if(order == UNORDERED) break;
        }
        switch (order) {
            case ASC:
                System.out.println("Ascending order"); break;
            case DESC:
                System.out.println("Descending order"); break;
            case CONST:
                System.out.println("Constant"); break;
            default:
                System.out.println("Unordered");
        }
    }
}
