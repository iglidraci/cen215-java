public class RandomCharacters {
    public static char getRandomCharacter(char from, char to) {
        /* to generate random numbers between lower and upper bounds we use
        Math.floor(lower + (Math.random() * (upper - lower + 1)))
        generating random characters is similar
        * */
        return (char) Math.floor(from + (Math.random() * (to - from + 1)));
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
