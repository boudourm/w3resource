package exercises.exercise54;

import java.util.Scanner;

public class Exercise54 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int firstNumberRightDigit = input.nextInt() % 10;
        System.out.print("Input the second number: ");
        int secondNumberRightDigit = input.nextInt() % 10;
        System.out.print("Input the third number: ");
        int thirdNumberRightDigit = input.nextInt() % 10;
        System.out.print("The result is: " +
                (firstNumberRightDigit == secondNumberRightDigit ||
                        secondNumberRightDigit == thirdNumberRightDigit ||
                        firstNumberRightDigit == thirdNumberRightDigit));
    }
}