package exercises.exercise118;

import java.util.Scanner;

public class Exercise118 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string : ");
        String givenString = input.nextLine();
        System.out.print("Input a string to search : ");
        String searchedString = input.nextLine();
        System.out.print(givenString.indexOf(searchedString));
    }
}