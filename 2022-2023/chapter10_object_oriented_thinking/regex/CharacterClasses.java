package regex;

public class CharacterClasses {
    public static void main(String[] args) {
        /**
         * The dot metacharacter '.' means any character
         */
        System.out.println("testa".matches("test."));
        /**
         * OR class
         * [abc] means match any of the characters
         */
        System.out.println("test".matches("t[abe]st"));
        /**
         * NOR class
         * [^abc] means the opposite of the above, any character beside a, b, c
         */
        System.out.println("test".matches("t[^abc]st"));
        /**
         * Range class
         * [a-z] is defining the range of allowed characters
         */
        System.out.println("hey".matches("[a-z][a-z][a-z]"));
        System.out.println("HE".matches("[a-zA-Z][a-zA-Z]")); // matching both uppercase and lowercase
        System.out.println("12".matches("[1-9][0-9]"));
        /**
         * Union class
         * Combining two or more character classes
         * [a-c[4-7]] meaning from a-c or from 4-7
         */
        System.out.println("c4".matches("[a-c[4-7]]4"));
        /**
         * Intersection class
         * Like union class but only the common elements between two classes
         * [1-5&&[3-6]] means from 3-5
         */
        System.out.println("33".matches("[1-5&&[3-6]]3"));
    }
}
