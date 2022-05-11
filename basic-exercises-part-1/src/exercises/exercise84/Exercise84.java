package exercises.exercise84;

import java.util.Scanner;

public class Exercise84 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        if (string.length() < 3) {
            System.err.print("The string length must be >= 3.");
            return;
        }
        String threeLastCharacters = string.substring(string.length() - 3);
        System.out.print(threeLastCharacters + string + threeLastCharacters);
    }
}