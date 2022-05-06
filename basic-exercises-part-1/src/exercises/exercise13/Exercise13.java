package exercises.exercise13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise13 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Input the width of the rectangle: ");
        double width = input.nextDouble();
        if (length < width) System.err.print("[ERROR] : The length of a rectangle should be greater than its width.");
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Perimeter is 2*(" + length + " + " + width + ") = " + df.format(2 * (length + width)));
        System.out.print("Area is " + length + "*" + width + " = " + df.format(length * width));
    }
}