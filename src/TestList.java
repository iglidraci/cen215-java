import java.util.*;

public class TestList {
    public static void main(String[] args) {
        var names = new ArrayList<String>();
        names.add("Igli");
        names.add("Ambra");
        names.add("Desa");
        names.add("Tila");
        names.forEach((x) -> System.out.println("test name: " + x));
        var array = names.toArray();
        var fromArray = Arrays.asList(array);
        System.out.println("After converting from array to list");
        fromArray.forEach(System.out::println);
        Integer[] a = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        var numbers = new ArrayList<>(Arrays.asList(a));
        System.out.println(Collections.max(numbers));
    }
}
