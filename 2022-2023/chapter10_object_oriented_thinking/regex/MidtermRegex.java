package regex;

public class MidtermRegex {
    public static void main(String[] args) {
        /**
         * Any number of letters(lower or upper) and only two numbers
         * They can be arranged in any way
         */
        System.out.println("1as2addaaa".matches("[a-zA-Z]*\\d[a-zA-Z]*\\d[a-zA-Z]*"));
        /**
         * Date format
         * Either DD/MM/YYYY or DD/MM/YY
         */
        System.out.println("04/04/2022".matches("\\d{2}/\\d{2}/\\d{2,4}"));
        /**
         * Your Epoka email format
         * At least two letters, followed by two numbers, followed by @epoka.edu.al
         */
        System.out.println("nlastname21@epoka.edu.al".matches("[a-z]{2,}\\d{2}@epoka\\.edu\\.al"));
        /**
         * Phone number
         * start with +355 6(7or8or9) 2 numbers 2 numbers 3 numbers (+355 69 11 11 111)
         */
        System.out.println("+355 69 11 11 111".matches("\\+355\\s6[7-9]\\s\\d{2}\\s\\d{2}\\s\\d{3}"));
    }
}
