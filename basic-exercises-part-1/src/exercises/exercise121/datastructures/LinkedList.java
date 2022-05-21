package exercises.exercise121.datastructures;

import java.util.List;
import java.util.Stack;

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
        Stack<Node> stack = new Stack<Node>();
        Node currentNode = this.head;
        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.getNext();
        }
        this.head = stack.pop();
        currentNode = this.head;
        while (!stack.isEmpty()) {
            currentNode.setNext(stack.pop());
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
    }

    public void print() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
    }

}
