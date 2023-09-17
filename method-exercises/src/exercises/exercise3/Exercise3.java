package exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string: ");
        String string = input.nextLine();
        System.out.print("The middle character in the string: ");
        displayMiddleCharacterOf(string);
    }

    private static void displayMiddleCharacterOf(String string) {
        System.out.print(string.charAt((string.length() % 2 == 0 ? (string.length() / 2 - 1) : string.length() / 2)));
    }
}