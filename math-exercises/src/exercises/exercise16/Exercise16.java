package exercises.exercise16;

import java.util.Scanner;

public class Exercise16 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the base: ");
        int base = input.nextInt();
        System.out.print("Input the exponent: ");
        int exponent = input.nextInt();
        System.out.print("Power of the number: " + pow(base, exponent));
    }

    private static int pow(int base, int exponent) {
        if (exponent == 0) return 1;
        return sum(pow(base, exponent - 1), base);
    }

    private static int sum(int number, int order) {
        if (order == 1) return number;
        return number + sum(number, order - 1);
    }
}