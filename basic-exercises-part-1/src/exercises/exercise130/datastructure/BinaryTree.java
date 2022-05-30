package exercises.exercise130.datastructure;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public int getMaxDepth() {
        return this.root.getMaxDepth();
    }
}
