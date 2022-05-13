package exercises.exercise87;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise87 {
    private static final Scanner input = new Scanner(System.in);
    private static final List<String> digits = Arrays.asList(
            new String[]{"Zero", "One", "Two", "Three", "Four", "Five",
                    "Six", "Seven", "Eight", "Nine"});

    public static void main(String[] args) {
        System.out.print("Original Number: ");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of the digits of the said number: " + sum);

        do {
            System.out.println(digits.get(sum % 10));
            sum /= 10;
        } while (sum != 0);
    }
}