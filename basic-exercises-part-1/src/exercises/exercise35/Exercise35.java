package exercises.exercise35;

import java.util.Scanner;


public class Exercise35 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the numver of sides on the polygon: ");
        int n = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.print("The area is: " +
                n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n)));
    }
}