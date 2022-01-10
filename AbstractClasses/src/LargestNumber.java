import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(19.9);
        numbers.add(new BigInteger("1099999999"));
        numbers.add(new BigDecimal("20000.19999"));
        Number max = getLargestNumber(numbers);
        System.out.println("Largest number is " + max);
    }
    public static Number getLargestNumber(ArrayList<Number> numbers) {
        if (numbers == null || numbers.size() == 0) {
            return null;
        }
        Number max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() > max.doubleValue())
                max = numbers.get(i);
        }
        return max;
    }
}
