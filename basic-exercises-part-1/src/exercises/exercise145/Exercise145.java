package exercises.exercise145;

import exercises.exercise145.datastructure.LinkedList;
import exercises.exercise145.datastructure.Node;

import java.util.Scanner;

public class Exercise145 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList list = new LinkedList(
                new Node(1, new Node(2, new Node(3, new Node(4, new Node(5)))))
        );
        System.out.println("Original node: ");
        list.print();
        System.out.print("\nInput the nth rank to remove : ");
        int nth = input.nextInt();
        list.removeNthElementFromTheEnd(nth);
        System.out.println("After removing 2nd element from end : ");
        list.print();
    }
}