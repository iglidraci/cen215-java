public class ArrayBasics {
    public static void main(String[] args) {
        int[] myList = new int[5];
        System.out.println("myList[0]=" + myList[0]);
        System.out.println("Length of myList=" + myList.length);
        double[] myList2 = {1.2, 3., 4.5};  // array initializer
        System.out.println("Length of myList2="+myList2.length);
        // initializing the array with random values
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100);
        }
        // displaying array's elements
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        System.out.println();
        // summing all elements
        int total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Sum is " + total);
        // Finding the smallest index of the largest element
        int max = myList[0];
        int index = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                index = i;
            }
        }
        System.out.printf("The largest element (%d) with the smallest index (%d)\n", max, index);

        // random shuffling
        for (int i = 0; i < myList.length; i++) {
            int j = (int) (Math.random() * myList.length);
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        // displaying array's elements
        printArray(myList);
    }

    public static void printArray(int[] array) {
        // print the elements of an array using for each loop
        for(int element : array)
            System.out.print(element + " ");
        System.out.println();
    }
}
