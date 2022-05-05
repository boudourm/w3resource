package exercises.exercise1;

import java.util.Scanner;

public class Exercise1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input your first name: ");
        String firstName = input.next();
        System.out.print("Input your last name: ");
        String lastName = input.next();
        System.out.println("\nHello\n" + firstName + " " + lastName);
    }
}
