import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
    public static void main(String[] args) {
        String[] names = {"Conor", "Jon", "Ben", "Jorge", "Kabob"};
        Map<Character, List<String>> grouped = Stream.of(names).collect(
                Collectors.groupingBy(x -> x.toLowerCase().charAt(0))
        );
        Map<Character, Long> counted = Stream.of(names).collect(
                Collectors.groupingBy(x -> x.toLowerCase().charAt(0), Collectors.counting())
        );
        if (grouped instanceof HashMap)
            System.out.println("Instance of HashMap");
        for (char key: grouped.keySet())
        {
            System.out.println("Current key: " + key);
            System.out.println(java.util.Optional.of(grouped.get(key)).get());
        }
        for(char key: counted.keySet())
            System.out.println(counted.get(key) + " names start with " + key);
    }
}
