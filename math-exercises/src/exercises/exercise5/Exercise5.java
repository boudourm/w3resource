package exercises.exercise5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {-1, -1, 0, 2, 2, 3, 0, 1, 5, 9};
        Set<Integer> absoluteValues = new HashSet<Integer>();
        for (int number : array) {
            int absoluteValue = Math.abs(number);
            if (!absoluteValues.contains(absoluteValue)) {
                absoluteValues.add(absoluteValue);
            }
        }
        System.out.print(absoluteValues.size());
    }
}