package exercises.exercise145.datastructure;

import java.util.Stack;

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

    public void removeNthElementFromTheEnd(int n) {
        Node node = this.head;
        Stack<Node> stack = new Stack<Node>();
        while (node != null) {
            stack.push(node);
            node = node.getNext();
        }
        for (int i = 1; i <= n; i++)
            stack.pop();
        if (stack.isEmpty())
            this.head = head.getNext();
        else {
            node = stack.pop();
            node.setNext(node.getNext().getNext());
        }
    }
}
