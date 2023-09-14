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

    public static void main(String[] args) {
        int[] values = {10, 5, 1, 3, 8, 4, 6, 2, 7, 9};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
    }
}
