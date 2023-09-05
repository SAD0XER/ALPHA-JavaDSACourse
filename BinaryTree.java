public class BinaryTree {

    public class Asd {
        int Mydata = 23;
    }

    //Node Class for Binary Tree.
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    //Time Complexity: O(n)
    public static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    //Tree Traversal.
    /*#1. Preorder Traversal. Linear Time Complexity: O(n)
    - There are 3 Rules of Preorder Traversal using Recursion:
    1st Print the Root.
    2nd Print Left subtree.
    3rd Print Right subtree.*/
    public static void preorder(Node root) { //Taking root of tree as a parameter.
        if (root == null) { //Base Case
            System.out.print(-1 + " "); //Add this line if you want to print -1 to show NULL node as well.
            return;
        }

        System.out.print(root.data + " "); //Printing Data.
        preorder(root.left); //Printing Left subtree.
        preorder(root.right); //Printing Right subtree.
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        BinaryTree tree = new BinaryTree();
        Node root = buildTree(nodes);
//        System.out.println(root.data);

        preorder(root);
    }
}
