public class RegexTest {
    public static void main(String[] args) {
        // . single char
        System.out.println("Java".matches("J..a"));
        // match any of strings ()
        System.out.println("Java".matches("Ja(al|im|va)"));
        // match any of chars[], a to b [a-b]
        System.out.println("Igli".matches("Ig[1234l]i"));
        // match any char except [^...], except [^a-c]
        System.out.println("Java".matches("Ja[^ba]a"));
        // [a-d[p-q]] a through d or p through q
        // [a-d&&[p-q] intersection of a through d and p through q
        // \d digit, \D non digit, \w word char, \W non-word char,
        // \s space char, \S non-space char
    }
}
