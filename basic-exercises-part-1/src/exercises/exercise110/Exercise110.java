package exercises.exercise110;

import java.util.Scanner;

public class Exercise110 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a positive integer: ");
        int integer = input.nextInt();
        int power = 4;
        while (power != integer) {
            if (integer % power != 0) {
                System.out.print(false);
                return;
            }
            power *= 4;
        }

        System.out.print(true);
    }
}