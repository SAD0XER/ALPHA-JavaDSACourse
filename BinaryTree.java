import java.util.*;

public class BinaryTree {

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

    //Tree Traversal using Recursion.
    /*#1. Preorder Traversal. Linear Time Complexity: O(n)
    * - There are 3 Rules of Preorder Traversal:
    1st Print the Root.
    2nd Print Left subtree.
    3rd Print Right subtree.*/
    public static void preorder(Node root) { //Taking root of tree as a parameter.
        if (root == null) { //Base Case
            System.out.print(-1 + " "); //Add this line if you want to print -1 to show NULL node as well.
            return;
        }

        System.out.print(root.data + " "); //Printing Data. Rule-1
        preorder(root.left); //Printing Left subtree. Rule-2
        preorder(root.right); //Printing Right subtree. Rule-3
    }

    /*#2. Inorder Traversal. Linear Time Complexity: O(n)
    Why Inorder? Because, Root comes IN BETWEEN the left and right subtree.
    * - There are 3 Rules of Inorder Traversal:
    1st Print Left subtree.
    2nd Print Root.
    3rd Print Right subtree.*/
    public static void inorder(Node root) {
        if (root == null) { //Base Case
            System.out.print(-1 + " "); //Add this line if you want to print -1 to show NULL node as well.
            return;
        }
        inorder(root.left); //Printing Left subtree. Rule-1
        System.out.print(root.data + " "); //Printing Root. Rule-2
        inorder(root.right); //Printing Right subtree. Rule-3
    }

    /*#3. Postorder Traversal. Linear Time Complexity: O(n)
    Post means बाद में (Later).
    * - There are 3 Rules of Postorder Traversal:
    1st Print Left subtree.
    2nd Print Right subtree.
    3rd Print Root.*/

    /*Level Order Traversal. Linear Time Complexity: O(n)
    - we'll use Queue Data Structure for this traversal.
    - we'll use BFS (Breadth First Search) approach in this traversal.
    - This traversal we'll solve by Iterative approach.*/
    public static void levelOrder(Node root) {
        if (root == null) { //Checking Root is empty or not.
            return;
        }

        Queue<Node> q = new LinkedList<>(); //Created Queue.
        q.add(root); //Firstly add root.
        q.add(null); //Added NULL to know print next line.

        while (!q.isEmpty()) {
            Node currNode = q.remove(); //Removing each element from Q and saving it in 'currNode'.
            if (currNode == null) { //Case for when we encounter NULL in a Queue.
                System.out.println();

                if (q.isEmpty()) { //Checking Queue is empty or NOT.
                    break;
                } else {
                    q.add(null); //If Queue is NOT empty then add NULL in Queue again.
                }

            } else {
                System.out.print(currNode.data + " "); //Printing data after removing element from Queue.

                if (currNode.left != null) { //Checking Left Child of Node is empty or NOT.
                    q.add(currNode.left); //Adding Left Child Node in Queue.
                }
                if (currNode.right != null) { //Checking Right Child of Node is empty or NOT.
                    q.add(currNode.right); //Adding Right Child Node in Queue.
                }
            }
        }
    }

    public static void postorder(Node root) {
        if (root == null) { //Base Case
            System.out.print(-1 + " "); //Add this line if you want to print -1 to show NULL node as well.
            return;
        }
        postorder(root.left); //Printing Left subtree. Rule-1
        postorder(root.right); //Printing Right subtree. Rule-2
        System.out.print(root.data + " "); //Printing Root. Rule-3
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        BinaryTree tree = new BinaryTree();
        Node root = buildTree(nodes);
//        System.out.println(root.data);

//        preorder(root);
//        inorder(root);
//        postorder(root);
        levelOrder(root);
    }
}
