package exercises.exercise22;

import java.util.Scanner;

public class Exercise22 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a binary number: ");
        System.out.print("Decimal Number: " + Integer.parseInt(input.next(), 2));
    }
}