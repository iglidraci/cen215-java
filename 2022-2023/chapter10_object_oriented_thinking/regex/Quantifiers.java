package regex;

public class Quantifiers {
    public static void main(String[] args) {
        /**
         * Quantifiers specify the number of occurrences to match
         */

        /**
         * ? match zero or one time
         */
        System.out.println("he".matches("he\\w?"));
        System.out.println("hey".matches("he\\w?"));
        System.out.println("heyy".matches("he\\w?"));
        /**
         * {0,2} means match zero to two times
         */
        System.out.println("hey".matches("h\\w{0,2}"));
        System.out.println("heyy".matches("h\\w{0,2}"));
        /**
         * The quantifier * matches 0 - undefined number of times
         */
        System.out.println("CEN215".matches("CEN*"));
        System.out.println("CEN215".matches("CEN\\d{0,}")); // alternative to *
        /**
         * + matches at least once
         */
        System.out.println("CEN215".matches("CEN\\d+"));
        /**
         * {3} matches exactly three times
         */
        System.out.println("CEN25".matches("CEN\\d{3}"));
    }
}
