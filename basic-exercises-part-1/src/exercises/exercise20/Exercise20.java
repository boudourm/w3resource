package exercises.exercise20;

import java.util.Scanner;

public class Exercise20 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a decimal number: ");
        System.out.print("Hexadecimal number is: " + Integer.toHexString(input.nextInt()).toUpperCase());
    }
}