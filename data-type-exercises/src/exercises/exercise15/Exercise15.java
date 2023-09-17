package exercises.exercise15;

import java.util.Scanner;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a floating number : ");
        float floatingNumber = input.nextFloat();
        System.out.println("Initial floating number: " + floatingNumber);
        System.out.println("Float " + floatingNumber + " next down is " + Math.nextAfter(floatingNumber, Float.NEGATIVE_INFINITY));
        System.out.println("Float " + floatingNumber + " next up is " + Math.nextAfter(floatingNumber, Float.POSITIVE_INFINITY) + "\n");
        System.out.print("Input a double : ");
        double doubleNumber = input.nextDouble();
        System.out.println("Initial double number: " + doubleNumber);
        System.out.println("Double " + doubleNumber + " nex down is " + Math.nextAfter(doubleNumber, Double.NEGATIVE_INFINITY));
        System.out.print("Double " + doubleNumber + " next up is " + Math.nextAfter(doubleNumber, Double.POSITIVE_INFINITY));
    }
}