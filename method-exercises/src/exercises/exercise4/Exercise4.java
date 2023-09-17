package exercises.exercise4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);

    private static final Set<Character> VOWELS =
            new HashSet<Character>(
                    Arrays.asList(
                            new Character[]{'a', 'e', 'i', 'o', 'u'}));

    public static void main(String[] args) {
        System.out.print("Input the string: ");
        System.out.print("Number of Nowels in the string: " + countVowelsIn(input.nextLine()));
    }

    private static int countVowelsIn(String string) {
        int numberOfVowels = 0;
        for (char character : string.toCharArray()) {
            if (VOWELS.contains(character))
                numberOfVowels++;
        }
        return numberOfVowels;
    }
}