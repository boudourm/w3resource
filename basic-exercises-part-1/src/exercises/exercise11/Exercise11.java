package exercises.exercise11;

import java.util.Scanner;

public class Exercise11 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Perimeter is = " + Math.PI * 2 * radius);
        System.out.print("Area is = " + Math.pow(radius, 2) * Math.PI);
    }
}