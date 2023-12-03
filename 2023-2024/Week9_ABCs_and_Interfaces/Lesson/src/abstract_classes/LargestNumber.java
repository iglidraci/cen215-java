package abstract_classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        * Number is an abstract superclass for numeric wrapper classes like Integer, Double, BigInteger, BigDecimal
        * */
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(10.4);
        numbers.add(new BigInteger("2000000"));
        numbers.add(new BigDecimal("999121.999"));
        System.out.println("Largest number: " + getLargestNumber(numbers));

    }
    static Number getLargestNumber(ArrayList<Number> numbers) {
        if (numbers == null || numbers.isEmpty()) return null;
        Number max = numbers.get(0);
        for(Number nr : numbers) {
            if (nr.doubleValue() > max.doubleValue())
                max = nr;
        }
        return max;
    }
}
