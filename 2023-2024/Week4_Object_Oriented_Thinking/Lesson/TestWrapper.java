import javax.swing.JOptionPane;

public class TestWrapper {
    public static void main(String[] args) {
        Integer day = new Integer(1);
        Integer year = 2022; // auto boxing
        Double weight = new Double(2.5);
        Double speed = 20.4;
        long milliseconds = new Long("100000"); // auto unboxing
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        Double height = Double.valueOf("120.4");
        System.out.println(height.doubleValue());
        System.out.println(height.intValue());

        /**
         * Each numeric wrapper class has two overloaded parsing methods to parse a
         * numeric string into an appropriate numeric value based on 10 (decimal) or any specified radix
         * (e.g., 2 for binary, 8 for octal, and 16 for hexadecimal).
         */
        byte age = Byte.parseByte(JOptionPane.showInputDialog("Enter your age"));
        System.out.println("Your age: " + age);
        byte binaryAge = Byte.parseByte("1001", 2);
        System.out.println("Binary age: " + binaryAge);
        Integer[] intArray = {1, 2, 3}; // autoboxing
        System.out.println(intArray[0] + intArray[1] + intArray[2]);
        /**
         * The instances of all wrapper classes are immutable, once you create
         * them, you can never change their value
         */
    }
}
