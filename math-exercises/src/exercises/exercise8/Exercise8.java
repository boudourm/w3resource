package exercises.exercise8;

import java.util.Scanner;

public class Exercise8 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer number: ");
        int integer = input.nextInt();
        System.out.print("The absolute value of " + integer + " is: " + Math.abs(integer));
    }
}