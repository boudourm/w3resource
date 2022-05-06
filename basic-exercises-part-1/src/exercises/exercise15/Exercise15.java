package exercises.exercise15;

import java.util.Scanner;

public class Exercise15 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("INput the second number: ");
        int secondNumber = input.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.print("Swapped values are: " + firstNumber + " and " + secondNumber);
    }
}