public class BinarySearchTree {

    //Created Node class for BST.
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    //Insert function to insert values in BST.
    public static Node insert(Node root, int value) {
        if (root == null) { //Base Case.
            root = new Node(value);
            return root;
        }

        if (root.data > value) { //If value is < root data -> insert it in left subtree. /*If you want to reverse BST then simply just change the '>' sign to '<'.*/
            root.left = insert(root.left, value);
        } else { //If value is > root data -> insert it in right subtree.
            root.right = insert(root.right, value);
        }

        return root;
    }

    //Inorder function to print BST in order.
    public static void inorder(Node root) {
        if (root == null) { //Base Case.
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //Search in BST. O(H) (PS: H is a Height of a Tree from Root to Leaf)
    public static boolean search(Node root, int key) {
        if (root == null) { //Base Case.
            return false;
        }

        if (root.data == key) { //Checking for if Root == Key
            return true;
        } else if (root.data > key) { //If Root is > Key
            return search(root.left, key); //Go To Left Subtree.
        } else {
            return search(root.right, key); //Go To Right Subtree.
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 5, 1, 3, 8, 4, 6, 2, 7, 9};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if (search(root, 11)) {
            System.out.print("Key Found");
        } else {
            System.out.print("Key NOT Found");
        }
    }
}
