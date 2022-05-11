package exercises.exercise82;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise82 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {20, 30, 40, 50, 67};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.print("Largest element between first, last, and middle values: " +
                Math.max(array[0], Math.max(array[array.length / 2], array[array.length - 1])));
    }
}