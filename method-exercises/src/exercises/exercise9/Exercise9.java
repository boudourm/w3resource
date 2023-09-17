package exercises.exercise9;

import java.util.Scanner;

public class Exercise9 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input character 1 :");
        char character1 = input.next().charAt(0);
        System.out.print("Input character 2 :");
        char character2 = input.next().charAt(0);
        printCharactersBetween(character1, character2);
    }

    private static void printCharactersBetween(char character1, char character2) {
        for (char character = character1; character <= character2; character++) {
            System.out.print(character + " ");
            if (((int) character - (int) character1 + 1) % 20 == 0)
                System.out.println();
        }
    }
}