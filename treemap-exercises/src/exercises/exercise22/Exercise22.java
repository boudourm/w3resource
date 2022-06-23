package exercises.exercise22;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise22 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
                Map.of(10, "Red", 20, "Green", 30, "Black", 40, "White", 50, "Pink")
        );
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.print("Input starting key : ");
        Integer beginning = input.nextInt();
        System.out.print("Input ending key : ");
        Integer end = input.nextInt();
        System.out.print("sub map key-values: " + treeMap.subMap(beginning, true, end, true));
    }
}