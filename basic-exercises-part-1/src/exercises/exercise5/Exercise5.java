package exercises.exercise5;

import java.util.Scanner;

public class Exercise5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input last number: ");
        int lastNumber = input.nextInt();
        System.out.print(firstNumber + " x " + lastNumber + " = " + (firstNumber * lastNumber));
    }
}
