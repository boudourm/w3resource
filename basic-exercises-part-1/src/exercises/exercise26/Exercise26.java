package exercises.exercise26;

import java.util.Scanner;

public class Exercise26 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input any octal nmuber: ");
        System.out.print("Equivalent binary nmuber: " + Integer.toBinaryString(Integer.parseInt(input.next(), 8)));
    }
}