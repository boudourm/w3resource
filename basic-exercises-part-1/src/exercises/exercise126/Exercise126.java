package exercises.exercise126;

import exercises.exercise126.datastructure.BinaryTree;
import exercises.exercise126.datastructure.Node;

import java.util.Scanner;

public class Exercise126 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(
                new Node(55,
                        new Node(21,
                                new Node(9),
                                new Node(29)),
                        new Node(80,
                                new Node(76),
                                new Node(91)))
        );
        System.out.print("Inorder traversal of binary tree is:\n" + tree.getInorderTravesal());
    }
}