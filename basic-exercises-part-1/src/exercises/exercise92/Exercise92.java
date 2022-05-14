package exercises.exercise92;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise92 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array));
        int odd = 0, even = 0;
        for (int number : array) {
            if (number % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even elements in the array: " + even);
        System.out.println("Number of odd elements in the array: " + odd);
    }
}