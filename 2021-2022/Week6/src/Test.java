import java.security.InvalidAlgorithmParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = {1, 2, 3};
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            int index = scanner.nextInt();
            if (index > 2)
                throw new InvalidAlgorithmParameterException("Index can't be more than 2");
            int a = array[index];
            System.out.println("Statement 3");
        }
        catch (InputMismatchException ignored){
        } catch (InvalidAlgorithmParameterException ex2) {
            throw  ex2;
        }
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}
