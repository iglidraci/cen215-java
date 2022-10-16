import java.util.stream.Stream;

public class Reduction {
    public static void main(String[] args) {
        String[] names = {"Conor", "Jon", "Ben", "Jorge", "Kabob"};
        String joinedNames = Stream.of(names).reduce("Dana", (x, y) -> x + ", " + y);
        System.out.println("Joined names are " + joinedNames);
    }
}
