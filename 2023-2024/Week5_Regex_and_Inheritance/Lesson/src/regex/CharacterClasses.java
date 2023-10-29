package regex;

public class CharacterClasses {
    public static void main(String[] args) {
        // The dot metacharacter '.' means any character
        System.out.println("testa".matches("test."));
        // OR class, [abc] means any of the characters inside brackets
        System.out.println("test".matches("t[abe]st"));
        // NOR class, [^abc] means any character beside a, b, c
        System.out.println("test".matches("t[^abc]st"));
        // Range class, [a-z] is defining the range of allowed characters
        System.out.println("hey".matches("[a-z][a-z][a-z]"));
        System.out.println("HE".matches("[a-zA-Z][a-zA-Z]")); // matching both uppercase and lowercase
        System.out.println("12".matches("[1-9][0-9]"));
        // Union class, Combining two or more character classes
        System.out.println("a4".matches("[a-c[4-7]]4")); // redundant, can be replaced with [a-c4-7]
        System.out.println("Hi".matches("[A-Z[^ier]]"));
        // Intersection class, only the common elements between two classes
        System.out.println("63".matches("[1-5&&[3-6]]3"));

        /*
        Some of the above character classes can be expressed in shorter terms
        Most of these characters start with backslash which has a special meaning in Java
        Therefore we will need to escape with another backslash
         */

        // \d matches a digit [0-9]
        // \D matches a non-digit [^0-9]
        System.out.println("CEN215".matches("CEN\\d\\d\\d"));
        System.out.println("CO2".matches("CO\\D"));

        // \s matches a white space
        // \S matches non-white space
        System.out.println("H 2".matches("H\\s\\d"));
        System.out.println("H2O".matches("H\\SO"));

        // \w matches a word character [a-zA-Z]
        // \W matches a non-word character
        System.out.println("h2o".matches("\\w\\d\\w"));
        System.out.println("h!".matches("\\w\\W"));

        // we can treat multiple characters as a single unit through capturing groups
        System.out.println("a1a2".matches("(\\w\\d){2,}"));
    }
}
