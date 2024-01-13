import java.util.ArrayList;
import java.util.List;

public final class Algorithms {
    public static <T> int count(List<T> list, Predicate<T> p) {
        int count = 0;
        for (T elem : list)
            if (p.test(elem))
                ++count;
        return count;
    }

    public static<T1, T2> List<T2> map(List<T1> list, Function<T1, T2> func) {
        ArrayList<T2> newList = new ArrayList<>();
        for(T1 element : list) {
            newList.add(func.apply(element));
        }
        return newList;
    }

    public static<T> List<T> filter(List<T> list, Predicate<T> p) {
        ArrayList<T> newList = new ArrayList<>();
        for(T element : list) {
            if(p.test(element)) newList.add(element);
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<String> list2 = new ArrayList<>(List.of("hello", "lol", "aibohphobia"));
        int countEven = Algorithms.count(list1, x -> x % 2 == 0);
        System.out.println(countEven);
        int countPalindrome = Algorithms.count(list2, x -> new StringBuilder(x).reverse().toString().equals(x));
        System.out.println(countPalindrome);
        List<Integer> list3 = Algorithms.map(list2, String::length);
        List<String> list4 = Algorithms.map(list2, x -> new StringBuilder(x).reverse().toString());
        System.out.println(list3);
        System.out.println(list4);
        List<Integer> list5 = Algorithms.filter(list1, x -> x % 2 == 1);
        System.out.println(list5);
    }
}