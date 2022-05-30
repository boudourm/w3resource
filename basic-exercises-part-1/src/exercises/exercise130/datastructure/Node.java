package exercises.exercise130.datastructure;

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

    private boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }

    public int getMaxDepth() {
        if (this.isLeaf())
            return 1;
        return 1 + Math.max(this.leftChild.getMaxDepth(), this.rightChild.getMaxDepth());
    }
}
