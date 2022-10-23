public class FallThrough {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday");
            case 0:
            case 6: System.out.println("Weekend");
            default: System.out.println("None of them");
        }

        switch (day) {
            case 1:System.out.println("Monday");
            case 2:System.out.println("Tuesday");
            case 3:System.out.println("Wednesday");
            case 4:System.out.println("Thursday");
            case 5: System.out.println("Friday"); break;
            case 0:
            case 6: System.out.println("Weekend");
        }
    }
}
