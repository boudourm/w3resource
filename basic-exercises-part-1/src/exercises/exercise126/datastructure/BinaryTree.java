package exercises.exercise126.datastructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public List<Integer> getInorderTravesal() {
        List<Integer> inOrderTraversal = new ArrayList<Integer>();
        this.browseInorderTraversal(this.root, inOrderTraversal);
        return inOrderTraversal;
    }

    private void browseInorderTraversal(Node node, List<Integer> inOrderTraversal) {
        if (node == null) return;
        this.browseInorderTraversal(node.getLeftChild(), inOrderTraversal);
        inOrderTraversal.add(node.getData());
        this.browseInorderTraversal(node.getRightChild(), inOrderTraversal);
    }
}
