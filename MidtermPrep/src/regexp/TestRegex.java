package regexp;

public class TestRegex {
    public static void main(String[] args) {
        midtermRegex();
    }
    private static void midtermRegex() {
        String phoneNr = "+355 69 11 11 111";
        String phoneFormat = "^\\+\\d{3} \\d{2} \\d{2} \\d{2} \\d{3}";
        System.out.println("Phone number " + phoneNr + (phoneNr.matches(phoneFormat) ? " is correct" : " is not correct"));
        String date = "55-11-2020";
        String dateFormat = "^(\\d|\\d{2})-\\d{2}-\\d{4}";
        System.out.println("Date " + date + (date.matches(dateFormat) ? " is correct": " is not correct"));
        // only letters and ending with a number
        String text = "AZZWasfasfdAA1";
        String textFormat = "[a-zA-Z]+[0-9]$";
        System.out.println("Text " + text + (text.matches(textFormat) ? " is correct" : " is not correct"));
    }
}
