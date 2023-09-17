package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int first = input.nextInt();
        System.out.print("Input the second number: ");
        int second = input.nextInt();
        System.out.print("Input the third number: ");
        int third = input.nextInt();
        System.out.print("The average value is " + computeAverageOf(first, second, third));
    }

    private static float computeAverageOf(int... numbers) {
        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}