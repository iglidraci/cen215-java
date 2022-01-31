/*
* The left subtree of a node contains values less than the node's value
* The right subtree of a node contains values greater than the node's value
* Each subtree is a BST itself
* */

public class BST<T extends Comparable<T>> {
    private Node<T> root;
    public BST(T rootValue) {
        root = new Node<>(rootValue);
    }
    private Node<T> insertRecursively (Node<T> currentRoot, T value) {
        if (currentRoot == null) {
            currentRoot = new Node<>(value);
            return currentRoot;
        }
        if (value.compareTo(currentRoot.value) < 0)
            currentRoot.left = insertRecursively(currentRoot.left, value);
        else if (value.compareTo(currentRoot.value) > 0)
            currentRoot.right = insertRecursively(currentRoot.right, value);
        return currentRoot;
    }
    public void insert(T value) {
        root = insertRecursively(root, value);
    }
    public T search (T value) {
        return searchRecursively(root, value);
    }

    private T searchRecursively(Node<T> root, T value) {
        if (root == null)
            return null;
        else if (root.value.compareTo(value) == 0)
            return value;
        else if (value.compareTo(root.value) < 0)
            return searchRecursively(root.left, value);
        return searchRecursively(root.right, value);
    }
    public boolean contains (T value) {
        return search(value) != null;
    }
    public void inorderTraversal()
    {
        inorderRecursively(root);
    }
    private void inorderRecursively(Node<T> root)
    {
        if (root != null) {
            inorderRecursively(root.left);
            System.out.println(root.value);
            inorderRecursively(root.right);
        }
    }
}

class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
