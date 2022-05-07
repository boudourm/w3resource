package exercises.exercise28;

import java.util.Scanner;

public class Exercise28 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a hexadecimal number: ");
        System.out.print("Equivalent decimal number is :" + Integer.parseInt(input.next(), 16));
    }
}