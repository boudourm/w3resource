package exercises.exercise77;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise77 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {5, -50, 10};
        int[] array2 = {50, 10};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.print(Arrays.toString(new int[]{array1[0], array2[array2.length - 1]}));
    }
}