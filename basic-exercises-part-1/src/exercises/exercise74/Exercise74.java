package exercises.exercise74;

import java.util.Scanner;

public class Exercise74 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        if (string.length() < 2) {
            System.err.print("The string must have a length >= 2.");
            return;
        }
        System.out.print(string.indexOf("10") == 0 ||
                string.lastIndexOf("10") == (string.length() - 2));
    }
}