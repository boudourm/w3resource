package exercises.exercise125.datastructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    public List<Integer> getPreorderTraversal() {
        List<Integer> preorderTraversal = new ArrayList<Integer>();
        this.browsePreorderTraversal(this.root, preorderTraversal);
        return preorderTraversal;
    }

    private void browsePreorderTraversal(Node node, List<Integer> preorderTraversal) {
        if (node == null) return;
        preorderTraversal.add(node.getData());
        browsePreorderTraversal(node.getLeftChild(), preorderTraversal);
        browsePreorderTraversal(node.getRightChild(), preorderTraversal);
    }
}
