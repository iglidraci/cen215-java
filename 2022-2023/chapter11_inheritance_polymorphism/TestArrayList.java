import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Berlin");
        cities.add("Kyiv");
        System.out.println(cities.get(2));
        cities.remove(1);
        cities.add("Rome");
        cities.add("Tirane");
        cities.add("Athens");
        System.out.println(cities);
        Collections.shuffle(cities);
        System.out.println("After shuffling");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println("After sorting");
        System.out.println(cities);
        Integer[] arr = {1, 2, 3, 4};
        // from array to list
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        Integer[] arr2 = new Integer[numbers.size()];
        // from list to array
        numbers.toArray(arr2);

    }
}
