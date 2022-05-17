package exercises.exercise116;

import java.util.Scanner;

public class Exercise116 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0)
                System.out.println(i + ": fizz buzz");
            else if (i % 3 == 0)
                System.out.println(i + ": fizz");
            else if (i % 5 == 0)
                System.out.println(i + ": buzz");
        }
    }
}