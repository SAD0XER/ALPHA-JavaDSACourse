public class CircularLinkedList {

    //Create Single Node in Circular Linked List.
    public static class Node {
        int data;
        Node next;
    }

    static Node addToEmptyLL(Node last, int data) {
        if (last != null) return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFirst(Node last, int data) {
        if (last == null) return addToEmptyLL(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addLast(Node last, int data) {
        if (last == null) return addToEmptyLL(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addBetween(Node last, int data, int idx) {
        if (last == null) return null;
        Node newNode, p;
        p = last.next;
        do {
            if (p.data == idx) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;
                if (p == last) last = newNode;
                return last;
            }
            p = p.next;
        } while (p != last.next);
        System.out.println(idx + "The given node is not present in the list");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if (last == null) return null;
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last, d = new Node();
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
        }

        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    static void printLL(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    public static void main(String[] para_coder) {
        Node last = null;
        last = addToEmptyLL(last, 6);
        last = addLast(last, 8);
        last = addFirst(last, 2);
        last = addBetween(last, 10, 2);
        printLL(last);
        deleteNode(last, 8);
        printLL(last);
    }
}
