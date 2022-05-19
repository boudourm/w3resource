package exercises.exercise117;

import java.util.Scanner;
import java.util.Stack;

public class Exercise117 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a positive integer: ");

        //Initialization
        int integer = input.nextInt();
        String root = "";
        int subtract = 0, digit = 0, sideNumber = 0;

        //Pluck the first digit
        Stack<Integer> pairs = splitInPairs(integer);
        int pair = pairs.pop();
        digit = findHighestSquareLessThan(pair);
        root += digit;
        subtract = pair - digit * digit;
        sideNumber = digit * 2;

        //Compute
        while (!pairs.isEmpty()) {
            pair = pairs.pop();
            subtract = subtract * 100 + pair;
            digit = findUnitForHighestSubstractOf(subtract, sideNumber);
            root += digit;
            sideNumber = sideNumber * 10 + digit;
            subtract -= sideNumber * digit;
            sideNumber += digit;
        }

        if (subtract != 0) {
            root += ".";
            for (int i = 0; i < 2; i++) {
                subtract = subtract * 100;
                digit = findUnitForHighestSubstractOf(subtract, sideNumber);
                root += digit;
                sideNumber = sideNumber * 10 + digit;
                subtract -= sideNumber * digit;
                sideNumber += digit;
            }
        }

        System.out.print("Square root of " + integer + " is : " + Double.parseDouble(root));

    }

    private static Stack<Integer> splitInPairs(int number) {
        Stack<Integer> pairs = new Stack<Integer>();
        do {
            pairs.push(number % 100);
            number /= 100;
        } while (number != 0);
        return pairs;
    }

    private static int findHighestSquareLessThan(int number) {
        int i;
        for (i = 0; i * i <= number; i++) {
        }
        return i - 1;
    }

    private static int findUnitForHighestSubstractOf(int number, int sideNumber) {
        int i;
        for (i = 0; (sideNumber * 10 + i) * i <= number && i < 10; i++) {
        }
        return i - 1;
    }
}