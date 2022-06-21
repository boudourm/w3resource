package exercises.exercise4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<String> hasSet = new HashSet<String>(Arrays.asList("Red", "White", "Pink", "Yellow", "Black", "Green"));
        System.out.println("Original Hash Set: " + hasSet);
        hasSet.removeAll(hasSet);
        System.out.print("Hash Set after removing all teh elements: " + hasSet);
    }
}