package exercises.exercise18;

import java.util.Scanner;

public class Exercise18 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first binary number: ");
        String firstBinary = input.next();
        System.out.print("Input the second binary number: ");
        String secondBinary = input.next();
        System.out.print("Productof two binary numbers: " +
                Integer.toBinaryString(
                        Integer.parseInt(firstBinary, 2) *
                                Integer.parseInt(secondBinary, 2)));
    }
}