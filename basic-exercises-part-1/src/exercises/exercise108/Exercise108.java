package exercises.exercise108;

import java.util.Scanner;

public class Exercise108 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a positive integer: ");
        int integer = input.nextInt();
        int digits = integer, sum = 0;
        while (integer >= 10) {
            if (digits == 0) {
                integer = sum;
                digits = sum;
                sum = 0;
            } else {
                sum += digits % 10;
                digits /= 10;
            }
        }
        System.out.print("The single digit number is: " + integer);
    }
}