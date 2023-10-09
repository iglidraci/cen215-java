public class TestPassByValue {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        System.out.println("Before swap call i=" + i + " and j=" + j);
        swapXOR(i, j);
        System.out.println("After swap call i=" + i + " and j=" + j);
    }

    public static void swapXOR(int i, int j) {
        i = i ^ j;
        j = j ^ i;
        i = i ^ j;
        System.out.println("Inside method i=" + i + " and j=" + j);
    }
}
