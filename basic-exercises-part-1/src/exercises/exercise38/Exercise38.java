package exercises.exercise38;

import java.util.Scanner;

public class Exercise38 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("The string is: ");
        String string = input.nextLine();
        char[] chars = string.toCharArray();
        int letters = 0, space = 0, number = 0, other = 0;
        for (char character : chars) {
            if (Character.isSpaceChar(character))
                space++;
            else if (Character.isDigit(character))
                number++;
            else if (Character.isLetter(character))
                letters++;
            else other++;
        }
        System.out.println("letter: " + letters);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.print("other: " + other);
    }
}