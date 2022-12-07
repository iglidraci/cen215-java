import java.util.Arrays;

public class EX6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filter(1, 2, 3, 5, 6)));
        System.out.println(Arrays.toString(filter(8, 9, 11)));
        System.out.println(Arrays.toString(filter(10, 20, 6, 30, 40, 60)));
    }
    static int[] filter (int... numbers) {
        int[] filteredNumbers = new int[numbers.length];
        int found = 0;
        for(int nr : numbers) {
            if (nr % 2 == 0 ^ nr % 3 == 0) {
                filteredNumbers[found] = nr;
                found++;
            }
        }
        return Arrays.copyOfRange(filteredNumbers, 0, found);
    }
}
