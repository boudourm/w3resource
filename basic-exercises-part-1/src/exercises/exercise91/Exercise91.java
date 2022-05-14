package exercises.exercise91;

import java.util.Scanner;

public class Exercise91 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the max natural number to reach : ");
        int n = input.nextInt();
        System.out.println("The first " + n + " natural numbers are:");
        long start = System.nanoTime();
        for (int i = 1; i <= n; i++)
            System.out.println(i);
        long end = System.nanoTime();
        long executionTime = end - start;
        System.out.print("Estimated time (in nanosecond) to get the " +
                n + " first natural numbers: " + executionTime);
    }
}