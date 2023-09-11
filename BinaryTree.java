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
    public static void postorder(Node root) {
        if (root == null) { //Base Case
            System.out.print(-1 + " "); //Add this line if you want to print -1 to show NULL node as well.
            return;
        }
        postorder(root.left); //Printing Left subtree. Rule-1
        postorder(root.right); //Printing Right subtree. Rule-2
        System.out.print(root.data + " "); //Printing Root. Rule-3
    }

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

    //Height of Tree. O(n)
    public static int height(Node root) {
        if (root == null) { //Base Case.
            return 0;
        }

        int lh = height(root.left); //Counting Height of Left Subtree.
        int rh = height(root.right); //Counting Height of Right Subtree.

        return Math.max(lh, rh) + 1; //Finally, choosing maximum between left height & right height of tree and adding +1 in it and return.
    }

    //Count the Nodes of a Binary Tree. O(n)
    public static int count(Node root) {
        if (root == null) { //Base Case.
            return 0;
        }

        int leftCount = count(root.left); //Counting Nodes of Left Subtree.
        int rightCount = count(root.right); //Counting Nodes of Right Subtree.

        return leftCount + rightCount + 1; //Adding Counts of both side & adding +1 in it and Return.
    }

    //Sum of Nodes. O(n)
    public static int sum(Node root) {
        if (root == null) { //Base Case.
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    //Diameter of Tree: Approach-1 O(n^2)
    /*public static int diameter(Node root) {
        if (root == null) { //Base Case.
            return 0;
        }

        int leftDiameter = diameter(root.left); //1st
        int leftHeight = height(root.left); //Calculating Left Height for Self Diameter.
        int rightDiameter = diameter(root.right); //2nd
        int rightHeight = height(root.right); //Calculating Right Height for Self Diameter.

        int selfDiameter = leftHeight + rightHeight + 1; //3rd

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }*/

    //Diameter of Tree: Approach-2 O(n)
    /*static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) { //Base Case
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);
    }*/

    //Subtree of another Tree. (Find SubTree is existed in your Tree or NOT.)
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) { //Base Case.
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) { //Non-Identical Cases.
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) { //Base Case.
            return false;
        }

        if (root.data == subRoot.data) { //Step 1
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        //Step 2: all in 1 place.
        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
    }

    //Top View of a Tree. (Important Question)
    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        //Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                //True if it contains key, False if not.
                if (!map.containsKey(curr.hd)) { //First Time my HD is occurring.
                    map.put(curr.hd, curr.node); //Adding pair in within a map.
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    //Kth Level of a Tree (Print). O(n)
    public static void KthLevel(Node root, int level, int k) {
        if (root == null) { //Base Case.
            return;
        }
        if (level == k) { //If level is equals to K, then print the node data and return.
            System.out.print(root.data + " ");
            return;
        }

        KthLevel(root.left, level + 1, k);
        KthLevel(root.right, level + 1, k);
    }

    //Lowest Common Ancestor (LCA). O(n)
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) { //Node Found.
            return true;
        }

        //If Node not found.
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) { //If you found root on left or right side.
            return true;
        }

        path.remove(path.size() - 1); //If NOT then removing that current root from path.
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //Last Common Ancestor.
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        /*Last Equal Node will be on at i - 1st node.
        Why? Because, whenever this loop will break, the 'i' th Node is pointing towards UNEQUAL Node.*/
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static void main(String[] args) {
//        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

//        BinaryTree tree = new BinaryTree();
//        Node root = buildTree(nodes);
//        System.out.println(root.data);

//        preorder(root);
//        inorder(root);
//        postorder(root);
//        levelOrder(root);

        //Height of Tree. O(n)
        /*
                    1
                  /   \
                 2     3
                / \   / \
               4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        System.out.print(diameter(root).diameter);

        /*
                 2
                / \
               4   5
         */
        /*Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);*/

//        topView(root);
//        KthLevel(root, 1, 3);
        int n1 = 4, n2 = 5;
        System.out.println(lca(root, n1, n2).data);

    }
}
