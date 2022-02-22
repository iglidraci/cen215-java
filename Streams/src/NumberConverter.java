public class NumberConverter {
    private NumberConverter() {}
    public static int hex2Dec(String hexString) throws HexFormatException {
        int decimalValue = 0;
        String reversed = new StringBuilder(hexString.toUpperCase()).reverse().toString();
        for (int i = 0; i < hexString.length(); i++) {
            decimalValue += Math.pow(16, i) * hexCharToDecimal(reversed.charAt(i));
        }
        return decimalValue;
    }

    public static int bin2Dec(String binString) throws BinaryFormatException {
        int decimalValue = 0;
        String reversed = new StringBuilder(binString).reverse().toString();
        for (int i = 0; i < binString.length(); i++) {
            decimalValue += Math.pow(2, i) * binCharToDecimal(reversed.charAt(i));
        }
        return decimalValue;
    }

    private static int binCharToDecimal(char binChar) throws BinaryFormatException {
        return switch (binChar) {
            case '0' -> 0;
            case '1' -> 1;
            default -> throw new BinaryFormatException(binChar + " is not a binary char");
        };
    }

    private static int hexCharToDecimal(char hexChar) throws HexFormatException {
        if (hexChar >= 'A' && hexChar <= 'F')
            return 10 + hexChar - 'A';
        else if (hexChar >= '0' && hexChar <= '9')
            return hexChar - '0';
        else throw new HexFormatException(hexChar + " is not a hex char");
    }

}

class HexFormatException extends Exception {
    public HexFormatException(String message) {
        super(message);
    }
}

class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}
