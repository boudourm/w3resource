package exercises.exercise19;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise19 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
                Map.of(10, "Red", 20, "Green", 40, "Black", 50, "White", 60, "Pink")
        );
        System.out.println("Values before poll : " + treeMap);
        System.out.println("Value returned: " + treeMap.pollFirstEntry());
        System.out.print("Values after poll : " + treeMap);
    }
}