package exercises.exercise10;

import java.util.Scanner;

public class Exercise10 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a year: ");
        int year = input.nextInt();
        System.out.print(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        return (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}