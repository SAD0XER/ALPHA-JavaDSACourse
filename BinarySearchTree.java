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

    //Inorder function to print BST in order. [Utility Function for insert() method.]
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

    //Delete a Node. (Important Question)
    public static Node delete(Node root, int value) {

        //Search the value first.
        if (root.data < value) { //If Root Data is < Value.
            root.right = delete(root.right, value); //Go To Left Subtree.
        } else if (root.data > value) { //If Root Data is > Value.
            root.left = delete(root.left, value); //Go To Left Subtree.
        } else { //Case: Where root.data == value. #Voila Case.

            //Case 1: Leaf Node (No Child)
            if (root.left == null && root.right == null) {
                return null;
            }

            //Case 2: Single Child.
            if (root.left == null) { //If Left Child is Null
                return root.right; //Return Right Child Node.
            } else if (root.right == null) { //If Right Child is Null
                return root.left; //Return Left Child Node.
            }

            //Case 3: Two Child. (Both Children)*
            Node inorderSuccessor = findInorderSuccessor(root.right); //Step 1: Find Inorder Successor from Right Subtree.
            root.data = inorderSuccessor.data; //Step 2: Replace value with Root Data with Inorder Successors Data.
            root.right = delete(root.right, inorderSuccessor.data); //Step 3: Delete Inorder Successor Node.
        }
        return root;
    }

    //Utility Function for delete() method.
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    //Print in Range.
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) { //Base Case.
            return;
        }

        if (root.data >= k1 && root.data <= k2) { //If Root lies between k1 & k2.
            printInRange(root.left, k1, k2); //Go To Left.
            System.out.print(root.data + " "); //Print Root Data.
            printInRange(root.right, k1, k2); //Go To Right.
        } else if (root.data < k1) { //If Root Data is < than k1
            printInRange(root.left, k1, k2); //Go To Left.
        } else {
            printInRange(root.right, k1, k2); //Go To Right.
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        /*if (search(root, 11)) {
            System.out.print("Key Found");
        } else {
            System.out.print("Key NOT Found");
        }*/

        /*root = delete(root, 5);

        inorder(root);*/
        printInRange(root, 5, 12);
    }
}
