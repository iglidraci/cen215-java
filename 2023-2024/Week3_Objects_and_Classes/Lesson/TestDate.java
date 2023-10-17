import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime()); // Returns the number of milliseconds since January 1, 1970
        System.out.println(date.toString());

        Date date2 = new Date(System.currentTimeMillis() / 4);
        System.out.println(date2.toString()); // same as saying date2.toString()
        date2.setTime(System.currentTimeMillis() / 2);
        System.out.println(date2);
    }
}
