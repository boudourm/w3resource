package exercises.exercise63;

import java.util.Scanner;

public class Exercise63 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Result : " +
                (firstNumber == secondNumber ? 0 :
                        (firstNumber % 6 == secondNumber % 6 ?
                                Math.min(firstNumber, secondNumber) :
                                Math.max(firstNumber, secondNumber))));
    }
}