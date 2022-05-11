package exercises.exercise83;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise83 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.print("Result: ");
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] * array2[i] + " ");
    }
}