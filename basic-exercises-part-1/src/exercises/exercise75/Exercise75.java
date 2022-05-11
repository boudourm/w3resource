package exercises.exercise75;

import java.util.Scanner;

public class Exercise75 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        if (string.length() < 2) {
            System.err.print("The string must have a length >= 2");
            return;
        }
        System.out.print(string.charAt(0) == string.charAt(string.length() - 1));
    }
}