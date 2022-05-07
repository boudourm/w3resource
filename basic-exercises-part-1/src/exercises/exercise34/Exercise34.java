package exercises.exercise34;

import java.util.Scanner;

public class Exercise34 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the length of a side of the hesagon: ");
        System.out.print("The area of the hexgon is: " +
                6 * Math.pow(input.nextDouble(), 2) / (4 * Math.tan(Math.PI / 6)));
    }
}