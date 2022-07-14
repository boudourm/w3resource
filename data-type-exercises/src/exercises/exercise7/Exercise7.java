package exercises.exercise7;

import java.util.Scanner;

public class Exercise7 {
    private static final Scanner input = new Scanner(System.in);
    private static double METERS_TO_MILES = 0.000621;

    public static void main(String[] args) {
        System.out.print("Input distance in meters: ");
        double meters = input.nextInt();
        System.out.print("Input hour: ");
        double hour = input.nextInt();
        System.out.print("Input minutes: ");
        double minutes = input.nextInt();
        System.out.print("Input seconds: ");
        double seconds = input.nextInt();
        double mps = meters / (hour * 3600 + minutes * 60 + seconds);
        System.out.println("Your speed in meters/second is " + mps);
        double kmph = (meters / 1000) / (hour + minutes / 60 + seconds / 3600);
        System.out.println("Your speed in km/h is " + kmph);
        double mph = (meters * METERS_TO_MILES) / (hour + minutes / 60 + seconds / 3600);
        System.out.print("Your speed in miles/h is " + mph);
    }
}