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
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.printLL(); //1->2->3->4->5->null
//        System.out.println("LL size = " + size);
//        ll.removeFirst();
//        ll.printLL();
//
//        ll.removeLast();
//        ll.printLL();
//        System.out.println("LL size = " + size);
        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(10));
    }
}
