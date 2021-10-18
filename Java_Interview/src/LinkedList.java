
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}


public class LinkedList {
    Node head;

    void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    void printReverse(Node head) {
        if (head == null) {
            return;
        }
        printReverse(head.next);
        System.out.println(head.data);
    }

    void reverseList() {
        Node prev = null;
        Node next = null;
        Node current = head;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.printList();
        System.out.println("Before Print Reverse");

        Node root = list.head;
        list.printReverse(root);

        list.reverseList();
        System.out.println("After Print Reverse");
        list.printList();


    }


}
