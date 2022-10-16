import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* examples used in this class you can also find it following this link
* https://www.baeldung.com/regular-expressions-java
* */

public class MoreRegex {
    public static void main(String[] args) {
        String s = "world hello there hello";
        int count = getMatches("hello", s);
        System.out.println("Match count is = " + count);
        // So after finding the first hello, the rest is seen as any character.
        // That is why there is only a single match
        int count2 = getMatches("hello.", s);
        System.out.println(count2);
        // OR classes
        System.out.println(getMatches("[abc]", "cab"));
        System.out.println(getMatches("[bcr]at", "bat cat rat"));
        // NOR classes
        System.out.println(getMatches("[^abc]", "gag"));
        System.out.println(getMatches("[^abc]aa", "yep yaa"));
        // Range class
        // only 2 uppercase letters
        System.out.println(getMatches("[A-Z]", "This is Sparta!!"));
        // Matching both upper case and lower case letters:
        System.out.println(getMatches("[a-zA-Z]", "Two Uppercase alphabets 34 overall"));
        System.out.println(getMatches("[1-9]", "We're in 2021!"));

        // Union class
        // A union character class is a result of combining two or more character classes:
        System.out.println(getMatches("[1-2[8-9]]", "123456789"));

        // Intersection class
        // this class results from picking common elements between two or more sets, use &&
        System.out.println(getMatches("[1-6&&[3-9]]", "123456789"));
        // Subtraction class
        // negate one or more character classes
        System.out.println(getMatches("[0-9&&[^2468]]", "123456789"));
        // Predefined Character Classes
        // matching digits, same as [0-9]
        System.out.println(getMatches("\\d", "12a3"));
        // matching non digits, same as [^0-9]
        System.out.println(getMatches("\\D", "a2"));
        // matching whitespace and non whitespace
        System.out.println(getMatches("\\s", "hello world"));
        System.out.println(getMatches("\\S", "hello world"));
        // Matching a word character, equivalent to [a-zA-Z_0-9]:
        System.out.println(getMatches("\\w", "what's up"));
        // matching non-word char
        System.out.println(getMatches("\\W", "what's up"));

        // Quantifiers
        // enable us to further tweak the match's behavior by specifying
        // the number of occurrences to match against
        // To match a text zero or one time, we use the ? quantifier
        System.out.println(getMatches("\\a?", "hi"));
        System.out.println(getMatches("\\a{0,}", "hi"));
        System.out.println(getMatches("\\a+", "hi"));
        System.out.println(getMatches("\\a{1,}", "hi"));
        System.out.println(getMatches("a{3}", "aaaaaa"));

        boundaryMatchers();
    }

    private static void boundaryMatchers() {
        // To match only when the required regex is true at the beginning of the text, we use the caret ^
        System.out.println(getMatches("^cat", "cats are cute"));
        System.out.println(getMatches("^dog", "are dogs are friendly?"));

        // To match only when the required regex is true at the end of the text,
        // we use the dollar character $.
        System.out.println(getMatches("dog$", "Man's best friend is a dog"));
        System.out.println(getMatches("dog$", "is a dog man's best friend?"));
    }

    public static int getMatches(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find())
            count++;
        return count;
    }
}
