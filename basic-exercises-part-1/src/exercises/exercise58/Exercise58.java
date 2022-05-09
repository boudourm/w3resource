package exercises.exercise58;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise58 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Sentece: ");
        String[] words = input.nextLine().split(" ");
        String[] wordsStartingWithUpperCase = {};
        for (int i = 0; i < words.length; i++)
            words[i] = (words[i].charAt(0) + "").toUpperCase() + words[i].substring(1);
        System.out.print(Arrays.stream(words).collect(Collectors.joining(" ")));
    }
}