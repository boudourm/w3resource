package exercises.exercise141;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise141 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "xyyz";
        System.out.println("Original String : " + string);
        Set<Character> browesedCharacters = new HashSet<Character>();
        boolean result = true;
        for (char character : string.toCharArray()) {
            if (browesedCharacters.contains(character)) {
                result = false;
                break;
            } else {
                browesedCharacters.add(character);
            }
        }
        System.out.print("String has all unique characters: " + result);
    }
}