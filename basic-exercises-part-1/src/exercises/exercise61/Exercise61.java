package exercises.exercise61;

import java.util.Scanner;

public class Exercise61 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a word: ");
        System.out.print("Reversed word: " + new StringBuilder(input.nextLine()).reverse());
/*
Input a word: dsaf
Reverse word: fasd
 */
    }
}