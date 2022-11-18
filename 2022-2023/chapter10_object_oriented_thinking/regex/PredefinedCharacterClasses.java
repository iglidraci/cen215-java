package regex;

public class PredefinedCharacterClasses {
    public static void main(String[] args) {
        /**
         * Some previous character classes can be expressed in shorter terms
         * Most of these characters start with backslash which has a special meaning in Java
         * Therefore we will need to escape with another backslash
         */

        /**
         * \d matches a digit [0-9]
         * \D matches non digits [^0-9]
         */
        System.out.println("CEN215".matches("CEN\\d\\d\\d"));
        System.out.println("CO2".matches("CO\\D")); // -> false

        /**
         * \s matches a white space
         * \S matches non-white space
         */
        System.out.println("H 2".matches("H\\s\\d"));
        System.out.println("H2O".matches("H\\SO"));

        /**
         * \w matches a word character [a-zA-Z0-9]
         * \W matches a non-word character
         */
        System.out.println("h2o".matches("\\w\\d\\w"));
        System.out.println("h!".matches("\\w\\W"));
    }
}
