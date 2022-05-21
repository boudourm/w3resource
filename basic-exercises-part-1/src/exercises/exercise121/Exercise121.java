package exercises.exercise121;

import exercises.exercise121.datastructures.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise121 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] dataSet = {20, 40, 60, 80};
        LinkedList linkedList = new LinkedList(Arrays.asList(dataSet));
        System.out.println("Original Linked list: ");
        linkedList.print();
        System.out.println("\nReversed Linked list: ");
        linkedList.reverse();
        linkedList.print();
    }
}

