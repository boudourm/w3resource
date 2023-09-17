package exercises.exercise9;

import java.util.Scanner;

public class Exercise9 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a float numer: ");
        float number = input.nextFloat();
        System.out.print("The absolute value of " + number + " is: " + Math.abs(number));
    }
}