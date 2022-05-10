package exercises.exercise64;

import java.util.Scanner;

public class Exercise64 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        validateNumber(firstNumber);
        char[] firstNumberDigits = Integer.toString(firstNumber).toCharArray();
        System.out.print("Input the send number : ");
        int secondNumber = input.nextInt();
        validateNumber(secondNumber);
        char[] secondNumberDigits = Integer.toString(secondNumber).toCharArray();
        for (char firstDigit : firstNumberDigits) {
            for (char secondDigit : secondNumberDigits) {
                if (firstDigit == secondDigit) {
                    System.out.print("Result: " + true);
                    return;
                }
            }
        }
        System.out.print("Result: " + false);
    }

    private static void validateNumber(int number) {
        if (number < 25 || number > 75) {
            System.err.print(number + " is out of range.");
            return;
        }
    }
}