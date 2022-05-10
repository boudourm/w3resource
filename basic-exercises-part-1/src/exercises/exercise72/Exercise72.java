package exercises.exercise72;

import java.util.Scanner;

public class Exercise72 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a string of length >= 3: ");
        String string = input.nextLine();
        if (string.length() < 3)
            System.out.print("###");
        else
            System.out.print(string.substring(0, 3));
    }
}