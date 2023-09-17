package exercises.exercise15;

import java.util.Scanner;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
 Input first integer:  5
Input second integer:  25
Multiply of two integers: 125
 */
        System.out.print("Input first integer: ");
        int x = input.nextInt();
        System.out.print("INput second integer: ");
        int y = input.nextInt();
        System.out.print("Multiply of two integers: " + multiply(x, y));
    }

    private static int multiply(int x, int y) {
        int min, max;
        if (x <= y) {
            min = x;
            max = y;
        } else {
            min = x;
            max = y;
        }
        return multiplyAfterSort(min, max);
    }

    private static int multiplyAfterSort(int smallest, int largest) {
        if (smallest == 0 || largest == 0) return 0;
        if (smallest == 1) return largest;
        if (largest == 1) return smallest;
        return largest + multiply(smallest - 1, largest);
    }
}