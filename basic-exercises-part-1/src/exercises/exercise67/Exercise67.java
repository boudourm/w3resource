package exercises.exercise67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise67 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a sentence : ");
        ArrayList<String> sentence = new ArrayList<String>(Arrays.asList(input.nextLine().split(" ")));
        System.out.print("Input a word : ");
        sentence.add(sentence.size() / 2, input.nextLine());
        System.out.print(
                sentence.toString().substring(1, sentence.toString().length() - 1)
                        .replace(",", ""));

    }
}