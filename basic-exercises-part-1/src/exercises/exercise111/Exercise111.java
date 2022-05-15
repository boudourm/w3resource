package exercises.exercise111;

import java.util.Scanner;

public class Exercise111 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Sum : " + Math.addExact(firstNumber, secondNumber));
    }
}