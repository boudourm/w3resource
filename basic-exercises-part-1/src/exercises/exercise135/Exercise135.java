package exercises.exercise135;

import exercises.exercise135.datastructure.LinkedList;
import exercises.exercise135.datastructure.Node;

import java.util.Scanner;

public class Exercise135 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(
                new Node(12,
                        new Node(12,
                                new Node(13,
                                        new Node(14,
                                                new Node(15,
                                                        new Node(15,
                                                                new Node(16,
                                                                        new Node(17,
                                                                                new Node(17)))))))))
        );
        System.out.println("Original List with duplicate elements: ");
        linkedList.print();
        System.out.println();
        linkedList.removeDuplicates();
        System.out.println("After removing duplicates from the said list: ");
        linkedList.print();
    }
}