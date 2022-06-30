package exercises.exercise6;

import java.util.Scanner;

public class Exercise6 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        int integer = input.nextInt();
        int sign = integer < 0 ? -1 : 1;
        integer = Math.abs(integer);
        int reversed = 0;
        while (integer > 0) {
            reversed *= 10;
            reversed += integer % 10;
            integer /= 10;
        }
        System.out.print("Reversed number : " + reversed * sign);
    }
}