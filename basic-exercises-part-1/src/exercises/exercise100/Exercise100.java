package exercises.exercise100;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise100 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {10, 11, 10, 20, 43, 20, 50};
        int[] array2 = {10, 13, 11, 20, 44, 30, 50};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i] - array2[i]) == 1)
                count++;
        }
        System.out.println("Number of elements: " + count);
    }
}