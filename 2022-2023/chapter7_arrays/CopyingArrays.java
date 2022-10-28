public class CopyingArrays {
    public static void main(String[] args) {
        int[] srcList = {1, 2, 4, 1, 2};
        int[] destList = new int[srcList.length];
        // copy using a for loop
        for (int i = 0; i < srcList.length; i++) {
            destList[i] = srcList[i];
        }
        int[] destList2 = new int[srcList.length];
        System.arraycopy(srcList, 0, destList2, 0, srcList.length);
        System.out.println("First copy:");
        ArrayBasics.printArray(destList);
        System.out.println("Second copy");
        ArrayBasics.printArray(destList2);
    }
}
