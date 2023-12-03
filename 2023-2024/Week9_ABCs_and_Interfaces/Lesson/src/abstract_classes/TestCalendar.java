package abstract_classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        // Gregorian calendar with current date and time
        Calendar calendar = new GregorianCalendar();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Hour of the day: " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
        // Construct a calendar for December 25, 1997
        Calendar calendar1 = new GregorianCalendar(2010, Calendar.MAY, 22);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("May 22, 2010 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
