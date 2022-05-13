package exercises.exercise88;

import java.util.Scanner;

public class Exercise88 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Current System environment :");
        System.out.println(System.getenv());
        System.out.println("Current System properties: ");
        System.out.println(System.getProperties());
    }
}