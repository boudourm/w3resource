package exercises.exercise143.datastructure;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void print() {
        Node node = this.head;
        while (node.getNext() != null) {
            System.out.print(node.getData() + "->");
            node = node.getNext();
        }
        System.out.print(node.getData());
    }

    public static LinkedList mergeSortedLinkedLists(LinkedList list1, LinkedList list2) {
        Node node1 = list1.getHead();
        Node node2 = list2.getHead();
        Node head = null;
        if (node1.getData() < node2.getData()) {
            head = node1;
            node1 = node1.getNext();
        } else {
            head = node2;
            node2 = node2.getNext();
        }
        Node node3 = head;

        while (node1 != null && node2 != null) {
            if (node1.getData() < node2.getData()) {
                node3.setNext(node1);
                node3 = node3.getNext();
                node1 = node1.getNext();
            } else {
                node3.setNext(node2);
                node3 = node3.getNext();
                node2 = node2.getNext();
            }
        }

        if (node1 == null) {
            node3.setNext(node2);
        } else {
            node3.setNext(node1);
        }

        return new LinkedList(head);
    }
}
