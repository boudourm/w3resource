package exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer between 0 and 1000: ");
        int integer = input.nextInt();
        int sumOfDigits = 0;
        int remain = integer;
        while (remain != 0) {
            sumOfDigits += remain % 10;
            remain /= 10;
        }
        System.out.print("the sum of all digits in " + integer + " is " + sumOfDigits);
    }
}