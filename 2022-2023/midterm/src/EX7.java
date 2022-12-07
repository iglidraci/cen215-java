public class EX7 {
    public static void main(String[] args) {
        System.out.println(validateString(1, "A1abc"));
        System.out.println(validateString(1, "D123ac"));
        System.out.println(validateString(1, "n12aak"));
        System.out.println(validateString(1, "n1234aak")); // -> false
        System.out.println(validateString(1, "n123")); // -> false
        System.out.println(validateString(2, "02-30-2000"));
        System.out.println(validateString(2, "02-3-2000")); // -> false
        System.out.println(validateString(3, "+355 69 11 22 333"));
        System.out.println(validateString(3, "+355 68 12 12 123"));
        System.out.println(validateString(3, "+35568 12 12 123")); // -> false
    }

    static boolean validateString(int type, String str) {
        switch (type) {
            case 1:
                return str.matches("[a-zA-Z]\\d{1,3}[a-zA-Z]+");
            case 2:
                return str.matches("\\d{2}-\\d{2}-\\d{4}");
            case 3:
                return str.matches("\\+355\\s6[789]\\s\\d{2}\\s\\d{2}\\s\\d{3}");
            default:
                return false;
        }
    }
}
