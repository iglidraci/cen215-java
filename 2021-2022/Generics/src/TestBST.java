public class TestBST {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>(10);
        bst.insert(3);
        bst.insert(4);
        bst.insert(9);
        bst.insert(11);
        bst.insert(13);
        bst.insert(12);
        bst.inorderTraversal();
        System.out.println(bst.contains(2));
        System.out.println(bst.contains(3));
    }
}
