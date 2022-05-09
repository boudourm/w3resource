package exercises.exercise60;

import java.util.Scanner;

public class Exercise60 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Sentence: ");
        String[] sentence = input.nextLine().split(" ");
        System.out.print("Penultimate word: " + sentence[sentence.length - 2]);
    }
}