import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random generator1 = new Random(1);
        System.out.print("From generator 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator1.nextInt() + " ");
        }
        Random generator2 = new Random(1);
        System.out.print("\nFrom generator 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextInt() + " ");
        }
        System.out.println();
        System.out.println(generator1.nextInt(1, 2)); // bound is exclusive
    }
}
