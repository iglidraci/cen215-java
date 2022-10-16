package regexp;

public class MidtermRegex {
    public static void main(String[] args) {
        // only letters and 2 numbers
        System.out.println("1as2addaaa".matches("[a-zA-Z]*\\d[a-zA-Z]*\\d[a-zA-Z]*"));
        // date format -> either 4-02-1998 or 04-02-1998
        System.out.println("4-02-1998".matches("\\d\\d?-\\d{2}-\\d{4}"));
        // email format -> idraci19@epoka.edu.al
        System.out.println("idraci19@epoka.edu.al".matches("[a-z]+\\d{2}@epoka\\.edu\\.al"));
        // Only letters and starting with a number
        System.out.println("2saw".matches("\\d[a-zA-Z]+"));
        // only letters and ending with a number
        System.out.println("sasa1".matches("[a-zA-Z]+\\d"));
        // phone number -> start with +355 6(7or8or9) 2 numbers 2 numbers 3 numbers (+355 69 11 11 111)
        System.out.println("+355 69 11 11 111".matches("\\+355\\s6[7-9]\\s\\d{2}\\s\\d{2}\\s\\d{3}"));
    }
}
