package interfaces;

import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Berlin", "Moscow", "Kyiv", "Warsaw"};
        Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
        System.out.println();

    }
}
