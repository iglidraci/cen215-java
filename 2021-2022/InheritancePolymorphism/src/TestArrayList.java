import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        // notice type inference, no need to put String in the constructor type
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Tirana");
        cities.add("London");
        cities.add("Kiev");
        cities.add("Moscow");
        cities.set(0, "Paris");
        cities.remove("Paris");
        System.out.println(cities.size());
        cities.forEach(x -> System.out.print(x + " "));
        System.out.println();
//        printDistinctNumbers();
        usefulMethods();
    }

    private static void usefulMethods() {
        String[] states = {"Ukraine", "England", "France", "Germany"};
        ArrayList<String> statesList = new ArrayList<>(Arrays.asList(states));
        statesList.add("Belgium");
        statesList.add("Spain");
        statesList.remove(1);
        states = new String[statesList.size()];
        statesList.toArray(states);
        System.out.println("Array list:");
        statesList.forEach(state -> System.out.println(state));
        System.out.println("Array:");
        for(String state: states)
            System.out.println(state);
        Collections.sort(statesList);
        System.out.println("List sorted:");
        statesList.forEach(state -> System.out.println(state));
        Collections.shuffle(statesList);
        System.out.print("Binary search: ");
        System.out.println(Collections.binarySearch(statesList, "Ukraine"));
        System.out.println("List shuffled:");
        statesList.forEach(state -> System.out.println(state));
    }

    private static void printDistinctNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int input;
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            input = scanner.nextInt();
            if (!numbers.contains(input))
                numbers.add(input);
        } while (input != 0);
        System.out.print("Distinct numbers are: ");
        numbers.forEach(number -> System.out.print(number + " "));
    }
}
