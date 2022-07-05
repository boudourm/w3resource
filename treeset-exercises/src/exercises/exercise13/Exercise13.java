package exercises.exercise13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise13 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(10, 22, 36, 25, 16, 70, 82, 89, 14));
        System.out.println("Tree set : " + treeSet);
        System.out.println("Strictly less than 69 : " + treeSet.lower(69));
        System.out.println("Strictly less than 12 : " + treeSet.lower(12));
    }
}