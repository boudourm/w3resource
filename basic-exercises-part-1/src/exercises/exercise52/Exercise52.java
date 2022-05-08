package exercises.exercise52;

import java.util.Scanner;

public class Exercise52 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Input the third number: ");
        int thirdNumber = input.nextInt();
        System.out.print("The result is: " + (firstNumber + secondNumber == thirdNumber));
    }
}