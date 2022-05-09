package exercises.exercise62;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise62 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = input.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = input.nextInt();
        System.out.print(
                Arrays.asList(firstNumber, secondNumber, thirdNumber).contains(20) && (
                        Math.abs(firstNumber - secondNumber) > 20 ||
                                Math.abs(secondNumber - thirdNumber) > 20 ||
                                Math.abs(firstNumber - thirdNumber) > 20));
    }
}