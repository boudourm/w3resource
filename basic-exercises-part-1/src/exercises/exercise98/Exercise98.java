package exercises.exercise98;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise98 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 2, 40, 13, 20};
        System.out.println("Array : " + Arrays.toString(array));
        int twenties = 0, twentiesInARow = 0;
        for (int integer : array) {
            if (integer == 20) {
                twenties++;
                if (twentiesInARow++ == 3) {
                    System.out.print(false);
                    return;
                }
            } else
                twentiesInARow = 0;
        }
        System.out.print(twenties == 3);
    }
}