package exercises.exercise5;

import java.util.Scanner;

public class Exercise5 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the string: ");
        System.out.print("Number of words in teh string: " + countWordsIn(input.nextLine()));
    }

    private static int countWordsIn(String string) {
        return string.split(" ").length;
    }
}