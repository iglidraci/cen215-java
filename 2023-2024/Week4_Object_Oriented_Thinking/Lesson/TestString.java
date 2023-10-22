public class TestString {
    public static void main(String[] args) {
        String msg1 = new String("Welcome to Java");
        String msg2 = "Welcome to Java";
        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg1 == msg2);
        System.out.println(msg1.equals(msg2));
        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String msg3 = new String(charArray);
        System.out.println(msg3);
        // A String object is immutable, its contents cannot be changed
        System.out.println("Welcome".replace('e', 'A')); // returns new string WAlcomA
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
        // The split method can be used to extract tokens from a string with the specified delimiters
        String[] tokens = "Java#HTML#Perl".split("#");
        for(String token : tokens)
            System.out.println(token);
        // to convert a double value 5.44
        String height = String.valueOf(100.45);
        System.out.println(height);
        /**
         * The String class contains the static format method to return a formatted string.
         * This method is similar to the printf method except that the format method returns a formatted
         * string, whereas the printf method displays a formatted string
         */
        String s = String.format("%7.2f %6d %-4s", 45.556, 14, "AB");
        System.out.println(s);
    }
}
