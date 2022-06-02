package exercises.exercise135.datastructure;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
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

    public void removeDuplicates() {
        Node node = this.head;
        while (node.getNext() != null) {
            if (node.getData() == node.getNext().getData())
                node.setNext(node.getNext().getNext());
            else
                node = node.getNext();
        }
    }
}
