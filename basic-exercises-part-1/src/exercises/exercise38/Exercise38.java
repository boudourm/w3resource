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
            if (character == ' ') space++;
            else if (character >= '0' && character <= '9')
                number++;
            else if ((character >= 'A' && character <= 'Z')
                    || (character >= 'a' && character <= 'z'))
                letters++;
            else other++;
        }
        System.out.println("letter: " + letters);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}