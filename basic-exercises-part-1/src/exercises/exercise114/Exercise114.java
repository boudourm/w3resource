package exercises.exercise114;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise114 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        List<Character> characterList =
                input.nextLine().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        System.out.print("Input the offset : ");
        int offset = input.nextInt();
        for (int i = 1; i <= offset; i++) {
            characterList.add(characterList.remove(0));
        }
        System.out.print(characterList);
    }
}