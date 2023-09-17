package exercises.exercise11;

import java.util.Scanner;

public class Exercise11 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first integer number: ");
        int first = input.nextInt();
        System.out.print("Input the send integer number: ");
        int second = input.nextInt();
        System.out.print("The result is: " +
                (first == 15 || second == 15 || (first + second == 15) || (first - second == 15)));
    }
}