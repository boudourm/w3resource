package exercises.exercise127.datastructure;

public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Node(int data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getData() {
        return this.data;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }
}
