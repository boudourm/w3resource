package exercises.exercise80;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise80 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.print("Larger value between first and last element: " +
                Math.max(array[0], array[array.length - 1]));

    }
}