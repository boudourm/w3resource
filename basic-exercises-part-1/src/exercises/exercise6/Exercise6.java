package exercises.exercise6;

import java.util.Scanner;

public class Exercise6 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));
    }
}
