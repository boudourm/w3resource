package exercises.exercise14;

import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the number of sides: ");
        int numberOfSide = input.nextInt();
        System.out.print("Input the side: ");
        double side = input.nextDouble();
        System.out.print("The area of the polygone is :" + caclculateAreaOfPolygone(numberOfSide, side));
    }

    private static double caclculateAreaOfPolygone(int numberOfSides, double side) {
        //this one found the formula myself =b
        return (Math.pow(side, 2) * numberOfSides) / (4. * Math.tan(Math.PI / numberOfSides));
    }
}