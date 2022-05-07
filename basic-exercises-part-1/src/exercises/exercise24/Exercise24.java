package exercises.exercise24;

import java.util.Scanner;

public class Exercise24 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Binary Number : ");
        String binary = input.next();
        System.out.print("Equivalent Octal Value of " + binary + " : " + Integer.toOctalString(Integer.parseInt(binary, 2)));
    }
}