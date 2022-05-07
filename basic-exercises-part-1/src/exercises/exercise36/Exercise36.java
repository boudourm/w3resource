package exercises.exercise36;

import java.util.Scanner;

public class Exercise36 {
    private static final Scanner input = new Scanner(System.in);

    private static final double EARTHS_RADIUS = 6371.01;

    public static void main(String[] args) {
        System.out.print("Input the latitude of coordiannte 1: ");
        double x1 = Math.toRadians(input.nextDouble());
        System.out.print("Input the longitude of coordiante 1: ");
        double y1 = Math.toRadians(input.nextDouble());
        System.out.print("Input latitude of coordinate 2: ");
        double x2 = Math.toRadians(input.nextDouble());
        System.out.print("Input longitude of coordinate 2: ");
        double y2 = Math.toRadians(input.nextDouble());
        System.out.print("The distance betwen those points is: " +
                (EARTHS_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) +
                        Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
    }
}