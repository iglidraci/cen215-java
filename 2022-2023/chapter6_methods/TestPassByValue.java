public class TestPassByValue {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        System.out.println("Before swap call i=" + i + " and j=" + j);
        swap(i, j);
        System.out.println("After swap call i=" + i + " and j=" + j);
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("Inside swap method i=" + i + " and j=" + j);
    }
}
