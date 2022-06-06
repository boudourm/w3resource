package exercises.exercise143;

import exercises.exercise143.datastructure.LinkedList;
import exercises.exercise143.datastructure.Node;

import java.util.Scanner;

public class Exercise143 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(
                new Node(1, new Node(3, new Node(7, new Node(9, new Node(13)))))
        );
        LinkedList list2 = new LinkedList(
                new Node(2, new Node(40))
        );
        System.out.print("Linked list 1 = ");
        list1.print();
        System.out.println();
        System.out.print("Linked list 2 = ");
        list2.print();
        System.out.println();
        System.out.println("Merge the two sorted linked lists : ");
        LinkedList.mergeSortedLinkedLists(list1, list2).print();
    }
}