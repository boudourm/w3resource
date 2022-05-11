package exercises.exercise85;

import java.util.Scanner;

public class Exercise85 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String string = input.nextLine();
        System.out.print("Input a word : ");
        System.out.print(string.contains(input.next()));
    }
}