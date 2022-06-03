package exercises.exercise138;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise138 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] dictionnary = {"cat", "dog", "red", "red", "is", "am"};
        //String[] dictionnary = {"cat", "flag", "green", "country", "w3resource"};
        Set<String> longestWords = new HashSet<String>();
        int maxLength = 0;
        for (String word : dictionnary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
            }
            if (word.length() == maxLength)
                longestWords.add(word);
        }
        System.out.println("Original dictionnary : " + Arrays.toString(dictionnary));
        System.out.println("Longest word(s) of the above dictionnary : " + longestWords);
    }
}