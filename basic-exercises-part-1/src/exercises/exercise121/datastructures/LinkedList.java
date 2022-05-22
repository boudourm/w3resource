package exercises.exercise121.datastructures;

import java.util.List;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(List<Integer> dataSet) {
        Node node = new Node(dataSet.get(0));
        this.head = node;
        for (int i = 1; i < dataSet.size(); i++) {
            node.setNext(new Node(dataSet.get(i)));
            node = node.getNext();
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void reverse() {
        Node previousNode = null;
        Node currentNode = this.head;
        do {
            Node nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        } while (currentNode != null);
        this.head = previousNode;
    }

    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }

}
