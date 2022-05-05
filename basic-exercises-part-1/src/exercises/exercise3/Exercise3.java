package exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("The division of " + firstNumber + " and " + secondNumber + " is:" + (firstNumber / secondNumber));
    }
}
