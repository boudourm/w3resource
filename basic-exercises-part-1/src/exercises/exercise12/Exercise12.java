package exercises.exercise12;

import java.util.Scanner;

public class Exercise12 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the number(n) you want to calculate the average: ");
        int n = input.nextInt();
        double average = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Input number (" + i + "): ");
            average += input.nextDouble();
        }
        System.out.print("Average: " + average / n);
    }
    /*
    Input the number(n) you want to calculate the average:
     4
    Input number (1):
     2
    Input number (2):
     4
    Input number (3):
     4
    Input number (4):
     2
    Average:3.0
     */
}