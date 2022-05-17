package exercises.exercise115;

import java.util.Scanner;

public class Exercise115 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a positive integer : ");
        int positiveInteger = input.nextInt();
        char[] chars = Integer.toString(positiveInteger).toCharArray();
        System.out.println("Is " + positiveInteger + " is a palindrome number?");
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }
}