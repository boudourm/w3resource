package exercises.exercise41;

import java.util.Scanner;

public class Exercise41 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a charachter: ");
        char character = input.next().charAt(0);
        System.out.println("The ASCII value of " + character + " is : " + (int) character);
    }
}