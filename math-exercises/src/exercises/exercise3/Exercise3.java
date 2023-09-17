package exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double number = 324.97987;
        System.out.print(number + (number % 1 == 0 ? " is not a double." : " is a double."));
    }
}