package exercises.exercise127.datastructure;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public List<Integer> getPostorderTravesal() {
        List<Integer> postOrderTraversal = new ArrayList<Integer>();
        this.browsePostorderTraversal(this.root, postOrderTraversal);
        return postOrderTraversal;
    }

    private void browsePostorderTraversal(Node node, List<Integer> postOrderTraversal) {
        if (node == null) return;
        this.browsePostorderTraversal(node.getLeftChild(), postOrderTraversal);
        this.browsePostorderTraversal(node.getRightChild(), postOrderTraversal);
        postOrderTraversal.add(node.getData());
    }
}
