package exercises.exercise13;

import java.util.Scanner;

public class Exercise13 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input Side-1: ");
        double side1 = input.nextDouble();
        System.out.print("Input Side-2: ");
        double side2 = input.nextDouble();
        System.out.print("Input Side-3: ");
        double side3 = input.nextDouble();
        System.out.print("The area of the triangle is : " + calculateAreaOfTriangle(side1, side2, side3));
    }

    private static double calculateAreaOfTriangle(double side1, double side2, double side3) {
        //source : https://www.mathswithmum.com/area-triangle-3-sides/
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}