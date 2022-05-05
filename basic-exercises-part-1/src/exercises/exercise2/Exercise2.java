package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Sum: " + (firstNumber + secondNumber));
    }
}