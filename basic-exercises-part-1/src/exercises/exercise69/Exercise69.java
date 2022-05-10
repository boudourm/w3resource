package exercises.exercise69;

import java.util.Scanner;

public class Exercise69 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        if (string.length() % 2 != 0) {
            System.err.print("The string length must be even.");
            return;
        }
        System.out.print(string.substring(0, string.length() / 2));
    }
}