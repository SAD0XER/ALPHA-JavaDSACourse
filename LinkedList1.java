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
    /*public void addFirst(int data) {
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
    }*/

    //Adding Node at Last Place.
    /*public void addLast(int data) {
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
    }*/

    //Adding in Middle of LL that is at given index.
    /*public void add(int idx, int data) {
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
    }*/

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
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //Merge Sort on LL O(nLog n)
    /*public Node mergeSort(Node head) {
        //Base Case
        if (head == null || head.next == null) {
            return head;
        }

        //Find Mid
        Node mid = getMid(head);

        //Call MergeSort for Left Half & Right Half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //Merge
        return merge(newLeft, newRight);
    }*/

    private Node getMid(Node head) {
        Node slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //Mid Node
    }

    /*private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }*/

    //Zig-Zag Linked List.
    public void zigZag() {
        //Find Middle Node.
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        Node mid = slow;

        //Reverse the 2nd Half.
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //Alternate Merge (zigzag merge)
        while (left != null && right != null) {
            nextL = left.next; //Zig-Zag Code
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR; //Update Loop Code
            left = nextL;
        }
    }

    //Question 1: Intersection of Two Linked Lists
    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    //Question 2: Delete N Nodes After M Nodes of a Linked List
    /*static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }*/

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head, t;
        int count;
        while (curr != null) {
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;
            if (curr == null)
                return;
            t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                Node temp = t;
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
    }

    //Question 3: Swapping Nodes in a Linked List
    public void swapNodes(int x, int y) {
        if (x == y)
            return;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    //Question 4: Odd Even Linked List.
    void segregateEvenOdd() {
        Node end = head;
        Node prev = null;
        Node curr = head;

        while (end.next != null) end = end.next;

        Node new_end = end;
        while (curr.data % 2 != 0 && curr != end) {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }

        if (curr.data % 2 == 0) {
            head = curr;
            while (curr != end) {
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        } else prev = curr;

        if (new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    public static void main(String[] para_coder) {
        LinkedList1 ll = new LinkedList1();
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
//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = temp;
//        //1-> 2-> 3-> 4-> 2
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());

        //Create LL
//        LinkedList<Integer> ll = new LinkedList<>();
//
//        //Add into LL
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addFirst(0); //0->1->2
//
//        System.out.println(ll); //Printing the LL
//
//        //Remove from LL
//        ll.removeLast();
//        ll.removeFirst();
//
//        System.out.println(ll); //Printing the LL

        //Creating LL
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.addLast(6);
//        //1->2->3->4->5->6->Null
//
//        ll.printLL();
//        ll.zigZag();
//        ll.printLL();

        /*Assignment Question:
        Question 1: Intersection of Two Linked Lists
        Time Complexity : o(m*n)
        Space Complexity: o(1)*/
        /*Node head1, head2;

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint = ll.getIntersectionNode(head1, head2);
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }*/

        /*Question 2: Delete N Nodes After M Nodes of a Linked List
        Time Complexity : o(n)
        Space Complexity: o(1)*/
        /*Node head = null;
        int M = 2, N = 3;

        head = push(head, 10);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        System.out.printf("M = %d, N = %d \n" + "Input Linked list: ", M, N);
        printList(head);
        skipMdeleteN(head, M, N);
        System.out.printf("Output Linked list: ");
        printList(head);*/

        /*Question 3: Swapping Nodes in a Linked List
        Time Complexity : o(n)
        Space Complexity: o(1)*/
        /*ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);

        int x = 4, y = 3;
        System.out.printf("X = %d, Y = %d\n", x, y);
        System.out.print("Linked list before Swapping: ");
        ll.printList();
        ll.swapNodes(x, y); //Swap node x=4 and y=3.
        System.out.print("\nLinked list after Swapping: ");
        ll.printList();*/

        /*Question 4: Odd Even Linked List
        Time Complexity : o(n)
        Space Complexity: o(1)*/
        ll.push(11);
        ll.push(10);
        ll.push(8);
        ll.push(6);
        ll.push(4);
        ll.push(2);
        ll.push(0);
        
        System.out.print("Input Linked List: ");
        ll.printLL();
        ll.segregateEvenOdd();
        System.out.print("Output: Updated Linked List: ");
        ll.printLL();
    }
}
