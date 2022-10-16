import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = new GregorianCalendar(1998, Calendar.FEBRUARY, 4);
        printCalendarInfo(calendar);
        System.out.println("----------------");
        printCalendarInfo(calendar1);
    }
    public static void printCalendarInfo(Calendar calendar) {
        System.out.println("Current time: " + calendar.getTime());
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DAY OF YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("DAY OF WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY OF MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("WEEK OF THE MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK OF THE YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
