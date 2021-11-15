package exercise.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(Arrays.toString(list.toArray()));
        Lifo stack = new Lifo(list);
        Fifo queue = new Fifo(list);
        System.out.println(stack);
        System.out.println(queue);
        int[] numbersToInsert = {1, 10, 20, 30};
        for(int num: numbersToInsert) {
            stack.insert(num);
            queue.insert(num);
        }
        System.out.println("After inserting " + Arrays.toString(numbersToInsert));
        System.out.println(stack);
        System.out.println(queue);
        int count = 0;
        while (count < 2) {
            System.out.println("Stack removing "+ stack.remove());
            System.out.println("Queue removing " + queue.remove());
            count++;
        }
        System.out.println("After removing 2 elements from each");
        System.out.println(stack);
        System.out.println(queue);
    }
}
