package regex;

public class Examples {
    public static void main(String[] args) {
        // The pattern for Social Security numbers is xxx−xx−xxxx, where x is a digit
        System.out.println("111-22-3333".matches("\\d{3}-\\d{2}-\\d{4}"));
        // any number of letters and only two numbers
        System.out.println("-1da2addaaa".matches("[a-zA-Z]*-?\\d[a-zA-Z]*-?\\d[a-zA-Z]*"));
        // Date format either DD/MM/YYYY or DD/MM/YY
        System.out.println("04/04/20".matches("\\d{2}/\\d{2}/(\\d{2}|\\d{4})"));
        // Epoka email
        System.out.println("fbar22@epoka.edu.al".matches("[a-zA-Z]{2,}\\d{2}@epoka\\.edu\\.al"));
        // phone number, +355 6(7or8or9) 2 numbers 2 numbers 3 numbers
        System.out.println("+355 69 11 11 111".matches("\\+355\\s6[7-9]\\s\\d{2}\\s\\d{2}\\s\\d{3}"));
        // Java identifiers
        System.out.println("a2".matches("[a-zA-Z_$][a-zA-Z_$\\d]*"));
        // What strings are matched by this regex?
        System.out.println("".matches(".*"));

        String[] tokens = "Java,C?C#,C++;Python.Haskell".split("[.,:;?]");
        for (String token : tokens) System.out.println(token);
        tokens = "Java1HTML2Perl3Python10Scala".split("\\d+");
        for (String token : tokens) System.out.println(token);

        // greedy
        System.out.println("Jaaaaavaa".replaceFirst("a+", "R"));
        // lazy
        System.out.println("Jaaaaavaa".replaceFirst("a+?", "R"));

    }
}
