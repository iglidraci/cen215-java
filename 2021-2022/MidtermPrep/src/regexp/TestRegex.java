// most of the examples taken from https://www.baeldung.com/regular-expressions-java
// visit this page for more details

package regexp;

public class TestRegex {
    public static void main(String[] args) {
        // characterClasses();
        // predefinedCharacterClasses();
        // capturingGroups();
        boundaryMatchers();
    }

    private static void boundaryMatchers() {
        // syntax to specify the position of the matched sequence
        // where exactly in the input text the match should occur


        // To match only when the required regex is true at the beginning of the text, we use the caret ^.
        System.out.println("00355 69 11 11 111".matches("^00355.+"));
        // when the required regex is true at the end of the text, we use the dollar character $
        // make sure it ends with 3 numbers
        System.out.println("AAA361a".matches(".+(\\d\\d\\d)$"));
    }

    private static void capturingGroups() {
        // treat multiple characters as a single unit through capturing groups
        System.out.println("12aa".matches("(\\d\\d)(\\w\\w).+"));
        // \\1 back referencing can make the matcher see the input as a single match
        // avoid writing the same thing
        System.out.println("202020".matches("(\\d\\d)\\1\\1"));
        // is the same as saying
        System.out.println("202020".matches("(\\d\\d)(\\d\\d)(\\d\\d)"));
    }

    private static void predefinedCharacterClasses() {
        // \\d is equivalent to [0-9]
        // \d which represents a number, so we have to include \\
        System.out.println("1Aa".matches("\\d.*"));
        // \\D is equivalent to [^0-9], matching non digits
        System.out.println("1A".matches("\\D.*"));
        // \\s is matching white space
        // \\S is matching non-white space
        System.out.println("johnmorgan".matches(".+\\s.+"));
        // \\w matching a word character
        // \\W matching non word character
        System.out.println("H".matches("\\w.*"));
        System.out.println("??".matches("\\w.+"));
    }

    private static void characterClasses() {
        // make sure it doesn't start with a b or c and then any char
        // . matches any character, only on
        System.out.println("aa".matches("[^a-c]."));
        System.out.println("abd".matches("[a-c]b."));
        System.out.println("bob cat".matches("[a-d]ob cat"));
        System.out.println("A2".matches("[a-zA-Z]."));


        // union class, union two or more sets
         System.out.println("28".matches("[1-3[7-9]]."));


        // intersection class, similar to the union class, picking common elements between two or more sets
        // quantifiers say how many times the sequence of characters can be repeated for the match
        // * Matches zero or more occurrences.
        System.out.println("5aa".matches("[1-6&&[4-7]].*"));
        System.out.println("5".matches("[1-6&&[4-7]].*"));



        // + matches one or more occurrences
        // ? matches zero or one occurrence
        System.out.println("A".matches("[A-Z].+"));


        // subtraction class, negate one or more character classes
        // consider a string that should start with an odd number
         System.out.println("2OOP".matches("[0-9&&[^2468]].*"));
    }
}
