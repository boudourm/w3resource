package exercises.exercise4;

import java.util.Scanner;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days);
    }
}