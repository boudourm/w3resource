package exercises.exercise70;

import java.util.Scanner;

public class Exercise70 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first string : ");
        String firstString = input.nextLine();
        System.out.print("Input second string : ");
        String secondString = input.nextLine();
        if (firstString.length() == secondString.length()) {
            System.err.print("The 2 strings must be of different lengths.");
            return;
        }
        String shortString, longString;
        if (firstString.length() < secondString.length()) {
            shortString = firstString;
            longString = secondString;
        } else {
            shortString = secondString;
            longString = firstString;
        }

        System.out.print(shortString + longString + shortString);
    }
}