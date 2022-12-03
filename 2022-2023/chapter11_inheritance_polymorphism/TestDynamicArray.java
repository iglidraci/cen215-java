public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray ids = new DynamicArray();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        System.out.println("At index 3: " + ids.get(3));
        System.out.println(ids.remove(0));
        System.out.println(ids.remove(3));
        System.out.println(ids.get(5)); // this position doesn't exist
        System.out.println("Size: " + ids.size());
        System.out.println(ids);
    }
}
