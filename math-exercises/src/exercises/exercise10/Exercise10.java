package exercises.exercise10;

import java.util.Scanner;

public class Exercise10 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("INput a lfoat number: ");
        float number = input.nextFloat();
        System.out.print("The rounded value of " + number + " is: " + Math.round(number));
    }
}