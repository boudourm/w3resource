package exercises.exercise109;

import java.util.Scanner;

public class Exercise109 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a positive integer: ");
        System.out.print("Number of rows: " +
                (int) ((-1 + Math.sqrt(1 - 4 * (-input.nextInt() * 2))) / 2));
    }
}