package exercises.exercise68;

import java.util.Scanner;

public class Exercise68 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        if (string.length() < 3) {
            System.err.print("The string must be longer than 3.");
            return;
        }
        System.out.print(string.substring(string.length() - 3).repeat(4));
    }
}