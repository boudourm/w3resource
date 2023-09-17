package exercises.exercise6;

import java.util.Scanner;

public class Exercise6 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        System.out.print("The sum is " + computeSumOfDigits(input.nextInt()));
    }

    private static int computeSumOfDigits(int integer) {
        int sum = 0;
        while (integer != 0) {
            sum += integer % 10;
            integer /= 10;
        }
        return sum;
    }
}