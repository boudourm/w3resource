package exercises.exercise12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise12 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(10, 22, 36, 25, 16, 70, 82, 89, 14));
        System.out.println("Tree set: " + treeSet);
        System.out.println("Strictly greater than 76 : " + treeSet.higher(76));
        System.out.print("Strictly greater than 31 : " + treeSet.higher(31));
    }
}