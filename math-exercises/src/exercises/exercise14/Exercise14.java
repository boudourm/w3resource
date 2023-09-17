package exercises.exercise14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
 Input an integer:  25
Square root of a number using Babylonian method: 5.0
 */
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        System.out.print("Square root of a number using Babylonian method: " + babylonianSqrt(number));
    }

    //Used method : https://blogs.sas.com/content/iml/2016/05/16/babylonian-square-roots.html#:~:text=The%20Babylonian%20square%2Droot%20algorithm,Newton%20invented%20his%20general%20procedure.
    private static BigDecimal babylonianSqrt(int number) {
        double xn = guessInitialValue(number);
        while (Math.abs(xn * xn - number) > 0.01) {
            xn = (xn + number / xn) / 2.;
        }
        return (new BigDecimal(Double.toString(xn))).setScale(3, RoundingMode.HALF_UP);
    }

    private static int guessInitialValue(int number) {
        int numberOfDigits = Integer.toString(number).length();
        if (numberOfDigits % 2 == 1) numberOfDigits++;
        double guessOrder = Math.pow(10, numberOfDigits / 2);
        int guess1 = (int) (2 * guessOrder);
        int guess2 = (int) (7 * guessOrder);
        int difference1 = Math.abs(number - guess1 * guess1);
        int difference2 = Math.abs(guess2 * guess2 - number);
        if (difference1 < difference2)
            return guess1;
        return guess2;
    }
}