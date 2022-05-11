package exercises.exercise73;

import java.util.Scanner;

public class Exercise73 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the firstString : ");
        String firstString = input.nextLine();
        System.out.print("Input the secondString: ");
        String secondString = input.nextLine();
        System.out.print(
                (firstString.length() == 0 ? "#" : firstString.charAt(0) + "" +
                        (secondString.length() == 0 ? "#" : secondString.charAt(0))
                )
        );

    }
}