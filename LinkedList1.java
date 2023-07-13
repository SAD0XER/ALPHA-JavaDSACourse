public class LinkedList1 {
    //Created single node in LL.
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//    Methods of Linked List:

    //Adding Node at first place.
    public void addFirst(int data) {
        //Step 1: Create New Node.
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step 2: newNode next = head (Linking Process)
        newNode.next = head; //link

        //Step 3: head = newNode.
        head = newNode;
    }

    //Adding Node at Last Place.
    public void addLast(int data) {
        //step 1: Create New Node.
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step 2: next of tail = newNode (Linking Process)
        tail.next = newNode;

        //Step 3: Make tail = newNode
        tail = newNode;
    }

    //Adding in Middle of LL that is at given index.
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1, temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Removing First Node of LL.
    public int removeFirst() {
        //Special cases
        if (size == 0) {
            System.out.println("LL is Empty.");
            return Integer.MIN_VALUE; //Returning Infinity value.
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    //Removing Last Node of LL.
    public int removeLast() {
        //Special Cases
        if (size == 0) {
            System.out.println("LL is Empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = tail.data;
            head = tail = null;
            size = 0;
            return value;
        }

        //Finding Previous Node of Tail: i = size - 2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data; //tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    //Search in LL: Iterative Approach. O(n)
    public int iterativeSearch(int key) {
        Node temp = head;

        int i = 0;
        while (temp != null) {
            //If Key found then return Index.
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //Key Not found.
        return -1;
    }

    //Search in LL: Recursive Approach. O(n)
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    //TC = O(n) and SC = O(n)
    public int helper(Node head, int key) {
        //Base Case
        if (head == null) {
            return -1;
        }

        //Recursion/work
        if (head.data == key) {
            return 0;
        }

        //While Backtracking.
        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    //Reverse a LL: Iterative Approach O(n)
    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Find & Remove Nth Node from End: Iterative Approach O(n)
    public void deleteNthFromEnd(int n) {
        //calculate size
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        //Remove first Node operation
        if (n == size) {
            head = head.next;
            return;
        }

        //Finding Node size - n
        int i = 1, iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    //Check if LL is Palindrome or Not.
    public boolean checkPalindrome() {
        //Base Case
        if (head == null || head.next == null) {
            return true;
        }

        //step 1: Find Middle Node
        Node midNode = findMiddle(head);

        //step 2: Reverse 2nd Half from Middle.
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3: Compare Left Half == Right Half.
        Node right = prev; //Right Half Head.
        Node left = head; //Left Half Head.

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Slow-Fast Approach to find Middle Node. (Helper Function for checkPalindrome() method)
    public Node findMiddle(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is middle node.
    }

    //Detect Cyclic/Loop in LL using Floyd's Cyclic Find Algorithm.
    public static boolean isCycle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true; //cycle exist.
            }
        }
        return false; //cycle doesn't exist.
    }

    //Remove Cycle/Loop in LL.
    /*Note: This code is not written 4 full cyclic LL. (Full cyclic means the last node of LL pointing towards head node)
    If you want code 4 cyclic LL then change the initialization of `prev` (Node prev = head)*/
    public static void removeCycle() {
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (!cycle) return;

        //Find meeting point
        slow = head;
        Node prev = null; //Last Node
        while (fast != slow) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    //Printing the LL.
    public void printLL() {
        if (head == null) {
            System.out.println("LL is Empty.");
            return;
        } //Removing this case will result in printing "Null" when the LL is empty.

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] para_coder) {
//        LinkedList1 ll = new LinkedList1();
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.add(2, 3);

//        ll.printLL(); //1->2->2->1->null
//        System.out.println("LL size = " + size);
//        ll.removeFirst();
//        ll.printLL();

//        ll.removeLast();
//        ll.printLL();
//        System.out.println("LL size = " + size);
//        System.out.println(ll.recursiveSearch(3));
//        System.out.println(ll.recursiveSearch(10));
//        ll.reverseLL();
//        ll.printLL();
//        ll.deleteNthFromEnd(3);
//        ll.printLL();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        //1-> 2-> 3-> 4-> 2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}
