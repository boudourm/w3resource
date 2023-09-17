package exercises.exercise18;

import java.util.Scanner;

public class Exercise18 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.print("Count the numbers without digit 7, from 1 to 15: " + countNumbersWithout7Until(number));
    }

    private static int countNumbersWithout7Until(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (!Integer.toString(i).contains("7"))
                count++;
        }
        return count;
    }
}