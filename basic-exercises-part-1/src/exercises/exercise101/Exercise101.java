package exercises.exercise101;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise101 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 11, 10, 30, 45, 33, 53};
        System.out.println("Original Array: " + Arrays.toString(array));
        int tens = 0, twenties = 0;
        for (int number : array) {
            if (number == 10) tens++;
            else if (number == 20) twenties++;
        }
        System.out.print(tens > twenties);

    }
}