package exercises.exercise65;

import java.util.Scanner;

public class Exercise65 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = input.nextInt();
        int quotient = firstNumber / secondNumber;
        System.out.print(firstNumber - quotient * secondNumber);
    }
}