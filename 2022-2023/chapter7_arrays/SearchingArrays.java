public class SearchingArrays {
    public static void main(String[] args) {
        int[] list = {1, -4, 5, 9, 0, -3, 10};
        int key = 4;
        int index = linearSearch(list, key);
        System.out.println("Key=" + key + " while index=" + index);
        int[] sortedList = {1, 2, 3, 4, 5, 5, 6, 11};
        int index2 = binarySearch(sortedList, key);
        System.out.println("Key=" + key + " while index=" + index2);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (list[mid] == key)
                return mid;
            else if (list[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
