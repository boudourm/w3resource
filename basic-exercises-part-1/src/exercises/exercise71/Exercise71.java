package exercises.exercise71;

import java.util.Scanner;

public class Exercise71 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first string : ");
        String firstString = input.nextLine();
        System.out.print("input the second string : ");
        String secondString = input.nextLine();
        System.out.print(firstString.substring(1) + secondString.substring(1));
    }
}