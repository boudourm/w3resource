package exercises.exercise8;

import java.util.Scanner;

public class Exercise8 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
Input your name: Alexandra
Your name is: Alexandra
 */
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Your name is: " + name);
    }
}