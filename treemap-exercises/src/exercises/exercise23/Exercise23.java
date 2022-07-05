package exercises.exercise23;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise23 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
                Map.of(10, "Red", 20, "Green", 30, "Black", 40, "White", 50, "Pink")
        );
        System.out.println("Original TreeMap content: " + treeMap);
        System.out.print("Input a key : ");
        Integer key = input.nextInt();
        System.out.print("Entries with keys greater or equal to " + key + ": " + treeMap.tailMap(key, true));
    }
}