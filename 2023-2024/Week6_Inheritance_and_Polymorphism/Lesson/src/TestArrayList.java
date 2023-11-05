import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cairo");
        list.add("Warsaw");
        list.add("Milano");
        list.add(1, "Kyiv");
        list.add("Berlin");
        System.out.println("List size? " + list.size());
        System.out.println("Is Washington in the list? " + list.contains("Washington"));
        System.out.println("The location of Milano? " + list.indexOf("Milano"));
        list.remove(2);
        list.remove("Milano");
        System.out.println("The first city on the list? " + list.get(0));
        System.out.println(list);
        // useful methods
        String[] array = {"red", "green", "blue"};
        list = new ArrayList<>(Arrays.asList(array)); // create a list from an array
        String[] array1 = new String[list.size()];
        list.toArray(array1); // create an array from list
        Collections.sort(list);
        System.out.println(list);
    }
}
