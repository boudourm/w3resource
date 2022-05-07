package exercises.exercise27;

import java.util.Scanner;

public class Exercise27 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a octal number : ");
        System.out.print("Equivalent hexadecimal number: " + Integer.toHexString(Integer.parseInt(input.next(), 8)).toUpperCase());
    }
}