package exercises.exercise113;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise113 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        int[] newArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (k < array1.length + array2.length) {
            if (i == array1.length || array2[j] < array1[i]) {
                newArray[k] = array2[j];
                j++;
            } else {
                newArray[k] = array1[i];
                i++;
            }
            k++;
        }
        System.out.print("Merfed array: " + Arrays.toString(newArray));
    }
}