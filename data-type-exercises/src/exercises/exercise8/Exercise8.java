package exercises.exercise8;

import java.util.Scanner;

public class Exercise8 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the number : ");
        int number = input.nextInt();
        System.out.println("Square: " + Math.pow(number, 2));
        System.out.println("Cube: " + Math.pow(number, 3));
        System.out.print("Fourth power: " + Math.pow(number, 4));
    }
}