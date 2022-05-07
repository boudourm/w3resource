package exercises.exercise25;

import java.util.Scanner;

public class Exercise25 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input any octal number: ");
        System.out.print("Equivalent decimal number: " + Integer.parseInt(input.next(), 8));
    }
}