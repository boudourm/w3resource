package exercises.exercise30;

import java.util.Scanner;

public class Exercise30 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a hexadecimal number: ");
        System.out.print("Equivalent of octal number is: " + Integer.toOctalString(Integer.parseInt(input.next(), 16)));
    }
}