package exercises.exercise112;

import java.util.Scanner;

public class Exercise112 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        int number = input.nextInt();
        long buffer = number;
        int trailingZeros = 0;
        while (buffer > 0) {
            trailingZeros += buffer / 5;
            buffer /= 5;
        }
        System.out.print("Number of trainling zeos of the factorial of " + number + " is : " + trailingZeros);
    }
}