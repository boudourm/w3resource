package exercises.exercise19;

import java.util.Scanner;

public class Exercise19 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Decima Number : ");
        int decimal = input.nextInt();
        System.out.print("Bianry number is: " + Integer.toBinaryString(decimal));
    }
}