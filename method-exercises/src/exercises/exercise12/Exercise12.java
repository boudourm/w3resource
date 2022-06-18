package exercises.exercise12;

import java.util.Random;
import java.util.Scanner;

public class Exercise12 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        displaySquareMatrixOfOrder(input.nextInt());
    }

    private static void displaySquareMatrixOfOrder(int n) {
        Random random = new Random();
        for (int i = 1; i <= n * n; i++) {
            System.out.print(random.nextInt(2) + " ");
            if (i % n == 0)
                System.out.println();
        }
    }
}