package exercises.exercise5;

import java.util.Scanner;

public class Exercise5 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the time zone offset to GMT: ");
        int zoneOffset = input.nextInt();
        long miliseconds = System.currentTimeMillis();
        int seconds = (int) (miliseconds / 1000) % (3600 * 24);
        int hours = seconds / 3600;
        hours = Math.abs((hours - zoneOffset) % 24);
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        System.out.print("Current time is " + hours + ":" + minutes + ":" + seconds);
    }
}