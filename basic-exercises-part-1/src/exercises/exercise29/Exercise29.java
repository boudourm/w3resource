package exercises.exercise29;

import java.util.Scanner;

public class Exercise29 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Hexadecimal Number : ");
        System.out.print("Equivalent Binary Number is: " + Integer.toBinaryString(Integer.parseInt(input.next(), 16)));
    }
}