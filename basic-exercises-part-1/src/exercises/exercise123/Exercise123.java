package exercises.exercise123;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise123 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Array : " + Arrays.toString(array));
        int smallestSum = Integer.MAX_VALUE;
        int begin = 0, end = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if (sum < smallestSum) {
                    smallestSum = sum;
                    begin = i;
                    end = j;
                }
            }
        }
        System.out.print("Contiguous subarray with smallest sum : " +
                Arrays.toString(Arrays.copyOfRange(array, begin, end + 1)) +
                " = " + smallestSum);
    }
}