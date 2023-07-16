public class DoubleLinkedList {
    //Create Single Node in DLL.
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add element at First in DLL.
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Print DLL.
    public void printDLL() {
        Node temp = head;

        while (temp != null) {
            if (temp == head) {
                System.out.print("Null<- ");
            }

            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //Remove First.
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is Empty.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //Add element at Last in DLL.
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        //If List is Empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    //Remove Last.
    public int removeLast() {
        //If LL is Empty.
        if (head == null) {
            System.out.println("DLL is Empty.");
            return Integer.MIN_VALUE;
        }
        //If only one Node in LL.
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] para_coder) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(1);

        dll.printDLL();
        System.out.println(size);

        dll.removeLast();
        dll.printDLL();
        System.out.println(size);
    }
}
