package exercises.exercise90;

import java.util.Scanner;

public class Exercise90 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Environement variable PATH:");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironement variable TEMP:");
        System.out.println(System.getenv("TEMP"));
        System.out.println("\nEnvironement variable USERNAME:");
        System.out.print(System.getenv("USERNAME"));
    }
}