package exercises.exercise7;

import java.util.Scanner;

public class Exercise7 {
    private static final Scanner input = new Scanner(System.in);
    private static double METERS_TO_MILES = 0.000621;

    public static void main(String[] args) {
/*
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 */
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