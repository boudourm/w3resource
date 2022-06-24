package exercises.exercise1;

import java.util.Scanner;
import java.util.TreeSet;

public class Exercise1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Black");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("Red");
        treeSet.add("White");
        System.out.print("Tree set: " + treeSet);
    }
}