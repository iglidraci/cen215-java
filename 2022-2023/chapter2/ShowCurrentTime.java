public class ShowCurrentTime {
    public static void main (String[] args) {
        // get the number of milliseconds since January 1 1970
        long millis = System.currentTimeMillis();
        long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        long currentSecond = totalSeconds % 60;
        long currentMinute = totalMinutes % 60;
        long currentHour = totalHours % 24;

        System.out.printf("Current GMT: %d H : %d M : %d S", currentHour,
                            currentMinute, currentSecond);
    }
}
