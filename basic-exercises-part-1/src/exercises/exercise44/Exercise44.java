package exercises.exercise44;

import java.util.Scanner;

public class Exercise44 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number: ");
        int n = input.nextInt();
        System.out.println(n + " + " + n + "" + n + " + " + n + "" + n + "" + n);
    }
}