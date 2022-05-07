package exercises.exercise23;

import java.util.Scanner;

public class Exercise23 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Binary Number: ");
        System.out.print("HexaDcimal value: " + Integer.toHexString(Integer.parseInt(input.next(), 2)).toUpperCase());
    }
}