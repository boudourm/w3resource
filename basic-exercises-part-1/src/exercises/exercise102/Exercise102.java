package exercises.exercise102;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise102 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {11, 11, 13, 31, 45, 20, 33, 53};
        System.out.println("Original Array: " + Arrays.toString(array));
        for (int number : array) {
            if (number == 10 || number == 30) {
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);
    }
}