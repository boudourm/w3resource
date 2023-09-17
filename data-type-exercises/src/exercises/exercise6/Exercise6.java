package exercises.exercise6;

import java.util.Scanner;

public class Exercise6 {
    private static final Scanner input = new Scanner(System.in);
    private static double LBS_TO_KG = 0.45359237;
    private static double IN_TO_M = 0.0254;

    public static void main(String[] args) {
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Input height in inches: ");
        double height = input.nextDouble();
        double bmi = weight * LBS_TO_KG / Math.pow(height * IN_TO_M, 2);
        System.out.print("Body Mass Index is : " + bmi);
    }
}