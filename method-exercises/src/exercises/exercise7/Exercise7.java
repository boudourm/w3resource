package exercises.exercise7;

import java.util.Scanner;

public class Exercise7 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        displayPentagonalNumberUntil(50);
    }

    private static void displayPentagonalNumberUntil(int n) {
        for (int i = 1; i <= n; i++) {
            int pentagonalNumber = (int) (3 * Math.pow(i, 2) - i) / 2;
            System.out.printf("%-6d", pentagonalNumber);
            if (i % 10 == 0)
                System.out.println();
        }
    }
}