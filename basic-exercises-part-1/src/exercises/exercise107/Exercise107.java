package exercises.exercise107;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise107 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {11, 12, 13, 14, 45, 20};
        System.out.print("Original Array: " + Arrays.toString(array));
        int consecutives = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == 1) {
                consecutives++;
                if (consecutives == 3) {
                    System.out.print(true);
                    return;
                }
            } else
                consecutives = 0;
        }
        System.out.print(false);
    }
}