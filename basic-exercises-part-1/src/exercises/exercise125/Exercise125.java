package exercises.exercise125;

import exercises.exercise125.datastructure.BinaryTree;
import exercises.exercise125.datastructure.Node;

import java.util.Scanner;

public class Exercise125 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Node root =
                new Node(55,
                        new Node(21,
                                new Node(9),
                                new Node(29)),
                        new Node(80,
                                new Node(76),
                                new Node(91)));

        System.out.print("Preorder traversal of binary tree is :\n" + new BinaryTree(root).getPreorderTraversal());
    }
}