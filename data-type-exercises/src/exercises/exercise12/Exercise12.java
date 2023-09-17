package exercises.exercise12;

import java.util.Scanner;

public class Exercise12 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = Integer.MIN_VALUE;
        int secondNumber = Integer.MAX_VALUE;

        System.out.println("Sugned integers: " + firstNumber + ", " + secondNumber);
        System.out.println("-----------------------------------------");
        System.out.println("Result of comparing signed numbers: " + Integer.compare(firstNumber, secondNumber));
        System.out.print("Result of comparing usigned numbers: " + Integer.compareUnsigned(firstNumber, secondNumber));
    }
}