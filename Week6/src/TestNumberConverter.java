public class TestNumberConverter {
    public static void main(String[] args) {
        try {
            System.out.println(NumberConverter.hex2Dec("af71"));
            System.out.println(NumberConverter.hex2Dec("AB8C"));
            System.out.println(NumberConverter.hex2Dec("0"));
            System.out.println(NumberConverter.bin2Dec("11100110"));
        } catch (HexFormatException | BinaryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
