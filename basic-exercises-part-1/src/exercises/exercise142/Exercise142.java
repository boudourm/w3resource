package exercises.exercise142;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise142 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
String-1 : wxyz
String-2 : zyxw
Check if two given strings are anagrams or not?: true
 */
        System.out.print("Input first string : ");
        String string1 = input.nextLine();
        System.out.print("Input second string : ");
        String string2 = input.nextLine();
        System.out.print("Check if two given strings are anagrams or not? : " + checkIfAnagrams(string1, string2));
    }

    private static boolean checkIfAnagrams(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        Map<Character, Integer> countOfLetter1 = new HashMap<Character, Integer>();
        Map<Character, Integer> countOfLetter2 = new HashMap<Character, Integer>();
        for (int i = 0; i < string1.length(); i++) {
            updateLetterCount(string1, i, countOfLetter1);
            updateLetterCount(string2, i, countOfLetter2);
        }
        if (countOfLetter1.keySet().size() != countOfLetter2.keySet().size())
            return false;
        for (Map.Entry<Character, Integer> entry : countOfLetter1.entrySet()) {
            if (!countOfLetter2.containsKey(entry.getKey())) return false;
            if (countOfLetter2.get(entry.getKey()) != entry.getValue()) return false;
        }
        return true;
    }

    private static void updateLetterCount(String string, int index, Map<Character, Integer> lettersCount) {
        char character = string.charAt(index);
        if (lettersCount.containsKey(character))
            lettersCount.replace(character, lettersCount.get(character) + 1);
        else
            lettersCount.put(character, 1);
    }
}