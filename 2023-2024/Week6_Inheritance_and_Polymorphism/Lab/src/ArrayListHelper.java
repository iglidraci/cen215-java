import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListHelper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 0, 1, 2, 2, 3, 4, 4, 1, 5));
        removeDuplicate(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 0, 1, 2, 2, 3, 4, 4, 1, 5, 0, 1, 1));
        removeDuplicate(list2, 0, 5);
        System.out.println(list2);

        ArrayList<Integer> unionList = union(new ArrayList<>(Arrays.asList(5, 0, 1, 2, 2, 3, 4, 4, 1, 5)),
                new ArrayList<>(Arrays.asList(5, 10, 11, 20, 9, 0)));
        System.out.println(unionList);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            do {
                list.remove(x);
            } while (list.contains(x));
            list.add(i, x);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list, int min, int max) {
        ArrayList<Integer> list2 = new ArrayList<>(list);
        boolean[] exists = new boolean[max - min + 1];
        list.clear();
        for(int x : list2) {
            if(!exists[x - min]) {
                exists[x - min] = true;
                list.add(x);
            }
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);
        removeDuplicate(list);
        return list;
    }
}
