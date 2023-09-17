package exercises.exercise13;

import java.util.Scanner;

public class Exercise13 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
Input a Decimal Number : 7
Binary number is: 111
Length of the longest sequence: 0
 */
        System.out.print("INput a Decimal Number : ");
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is: " + binary);

        int zeroes = 0, maxLength = 0;
        for (char digit : binary.toCharArray()) {
            if (digit == '0')
                zeroes++;
            else if (zeroes > 0) {
                maxLength = Math.max(maxLength, zeroes);
                zeroes = 0;
            }
        }
        System.out.print("Length of the longest sequence: " + Math.max(maxLength, zeroes));

    }
}