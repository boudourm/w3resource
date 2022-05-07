package exercises.exercise21;

import java.util.Scanner;

public class Exercise21 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Decimal Number: ");
        System.out.print("Octal number is: " + Integer.toOctalString(input.nextInt()));
    }
}