package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 following methods should be solved only with ArrayList
 they are probably not the most efficient ones
*/

public class TestArrayList {
    public static void main(String[] args) {
        final int total = 20;
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < total; i++) {
            list.add(random.nextInt(1, 10));
        }
        System.out.println("Before sorting");
        printList(list);
        sort(list, false, false);
        System.out.println("After sorting");
        printList(list);
        sort(list, false, true);
        printList(list);
        ArrayList<Integer> unique = removeDuplicate(list);
        System.out.println("After removing duplicate values:");
        printList(unique);
        ArrayList<Integer> union = unionLists(list, unique);
        System.out.println("After union the initial list with the unique list:");
        printList(union);
        sort(union, true, false);
        System.out.println("After sorting the union list:");
        printList(union);
    }

    private static void printList(ArrayList<Integer> list) {
        list.forEach(x->System.out.print(x + " "));
        System.out.println();
    }

    public static void sort(ArrayList<Integer> list, boolean asc, boolean builtInSort) {
        /*
         sort an array list
         asc is a boolean that indicates whether it will be ordered ascending or descending
         if true, it will be ascending, if false it will be descending
         if builtInSort is true, we are going to use Collection.sort method to sort it
         if builtInSort is false we are going to sort it from scratch with insertion sort
         this method should mutate the current list not return a new list
        */
        if (builtInSort) {
            Collections.sort(list);
            if(!asc)
                Collections.reverse(list);
        }
        else {
            for(int i=1; i<list.size(); i++) {
                int j = i-1;
                int key = list.get(i);
                while (j>=0 && ((list.get(j) > key && asc) || (list.get(j) < key && !asc))) {
                    list.set(j+1, list.get(j));
                    j--;
                }
                list.set(j+1, key);
            }
        }
    }
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        /* return a new array list with no duplicate values */
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer integer : list) {
            if (!unique.contains(integer))
                unique.add(integer);
        }
        return unique;
    }

    @SafeVarargs
    public static ArrayList<Integer> unionLists(ArrayList<Integer>... lists) {
        /* union together an array of lists */
        ArrayList<Integer> union = new ArrayList<>();
        for (ArrayList<Integer> list: lists)
            union.addAll(list);
        return union;
    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double val:list)
            sum += val;
        return sum;
    }
}
