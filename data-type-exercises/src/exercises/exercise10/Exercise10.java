package exercises.exercise10;

import java.util.Scanner;

public class Exercise10 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input six non-negative digits: ");
        int digits = input.nextInt();
        breakDownDigits(digits);
    }

    private static void breakDownDigits(int digits) {
        if (digits == 0) return;
        breakDownDigits(digits / 10);
        System.out.print(digits % 10 + " ");
    }
}