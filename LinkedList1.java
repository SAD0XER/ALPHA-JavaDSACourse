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

//    Methods of Linked List:

    //Adding Node at first place.
    public void addFirst(int data) {
        //Step 1: Create New Node.
        Node newNode = new Node(data);

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

        if (head == null) {
            head = tail = newNode;
            return;
        }

        //Step 2: next of tail = newNode (Linking Process)
        tail.next = newNode;

        //Step 3: Make tail = newNode
        tail = newNode;
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

    //Adding in Middle of LL that is at given index.
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

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

    public static void main(String[] para_coder) {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printLL();
        ll.add(2, 9);
        ll.printLL();
    }
}
