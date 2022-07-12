package exercises.exercise1;

import java.util.Scanner;

public class Exercise1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a degree in Fahrenheit : ");
        double fahrenheit = input.nextDouble();
        System.out.print(fahrenheit + " degree Fahrenheit is equal to " +
                (5 * (fahrenheit - 32) / 9) + " in Celsius");
    }
}