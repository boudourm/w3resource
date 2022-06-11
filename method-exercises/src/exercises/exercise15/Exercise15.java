package exercises.exercise15;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
Current date and time: Thursday June 22, 2017 7:5:36
 */
        System.out.print("Current date and time: ");
        displayCurrentDateAndTime();
    }

    private static void displayCurrentDateAndTime() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.print(
                ldt.getDayOfWeek().name() + " "
                        + ldt.getMonth().name() + " "
                        + ldt.getDayOfMonth() + ", "
                        + ldt.getYear() + " "
                        + ldt.toLocalTime().toString()
        );
    }
}