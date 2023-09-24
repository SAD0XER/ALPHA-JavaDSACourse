public class AVLTrees {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    // Function to Return the Height of a Tree.
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    // Right Rotated Subtree Rooted with Y.
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T1 = x.right;

        //Perform Rotation.
        x.right = y;
        y.left = T1;

        //Update Heights.
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        //Return New Root.
        return x;
    }

    // Left Rotated Subtree Rooted with X.
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        //Perform Rotation.
        y.left = x;
        x.right = T2;

        //Update Heights.
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        //Return New Root.
        return y;
    }

    // Function to calculate/get Balance Factor Node.
    public static int getBalanceFactor(Node root) {
        if (root == null) { //Base Case.
            return 0;
        }

        return height(root.left) - height(root.right); //Balance Factor (BF) = Height of Left Subtree - Height of Right Subtree.
    }

    // Function to Insert Elements in Tree.
    public static Node insert(Node root, int key) {
        if (root == null) { //Base Case.
            return new Node(key);
        }

        //Checking Where should be inserted According to BST Properties.
        if (key < root.data) { //If key is less than root data, then insert element on left subtree According to BST Properties.
            root.left = insert(root.left, key);
        } else if (key > root.data) { //If key is greater than root data, then insert element on right subtree According to BST Properties.
            root.right = insert(root.right, key);
        } else {
            return root; //Duplicate Keys are NOT allowed.
        }

        //Update Root Height.
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //Get root's Balance Factor.
        int bf = getBalanceFactor(root);

        //Left-Left Case.
        if (bf > 1 && key < root.left.data) { //Balance Factor of Screwed Trees (Left Side) are More +ve.
            return rightRotate(root);
        }
        //Right-Right Case.
        if (bf < -1 && key > root.right.data) { //Balance Factor of Screwed Trees (Right Side) are More -ve.
            return leftRotate(root);
        }
        //Left Right Case.
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.right);
            return rightRotate(root);
        }
        //Right Left Case.
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; //Return if AVL is Balanced.
    }

    public static void preorder(Node root) {
        if (root == null) { //Base Case.
            return;
        }

        System.out.print(root.data + " "); //1st Print the Root.
        preorder(root.left); //2nd Go To Left Subtree.
        preorder(root.right); //3rd Go To Right Subtree.
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
        AVL Tree
                    30
                   /  \
                  20   40
                 / \     \
               10   25    25
         */
        preorder(root);
    }
}
