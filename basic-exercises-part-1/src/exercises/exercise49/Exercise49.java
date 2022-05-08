package exercises.exercise49;

import java.util.Scanner;

public class Exercise49 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        System.out.print(1 - input.nextInt() % 2);
    }
}