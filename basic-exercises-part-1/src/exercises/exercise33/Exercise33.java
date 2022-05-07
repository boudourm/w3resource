package exercises.exercise33;

import java.util.Scanner;

public class Exercise33 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        int integer = input.nextInt();
        int sum = 0;
        while (integer != 0) {
            sum += integer % 10;
            integer /= 10;
        }
        System.out.print("The sum of the digits is:" + sum);

    }
}