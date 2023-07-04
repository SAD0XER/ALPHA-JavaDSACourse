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
        } //Removing this case will result in printing "Null" when the L L is empty.

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] para_coder) {
        LinkedList1 ll = new LinkedList1();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
    }
}
