package exercises.exercise14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>(Arrays.asList(new String[]{"Red", "Green", "Black", "Pink", "Orange"}));
        System.out.println("The Original linked list: " + linkedList);
        linkedList.removeAll(linkedList);
        System.out.print("The New linked list: " + linkedList);
    }
}