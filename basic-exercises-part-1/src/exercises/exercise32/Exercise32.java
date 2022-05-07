package exercises.exercise32;

import java.util.Scanner;

public class Exercise32 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first integer: ");
        int first = input.nextInt();
        System.out.print("Input second integer: ");
        int second = input.nextInt();
        String comparisons = first > second ? (first + " > " + second + "\n") : "";
        comparisons += first < second ? (first + " < " + second + "\n") : "";
        comparisons += first == second ? (first + " == " + second + "\n") : "";
        comparisons += first <= second ? (first + " <= " + second + "\n") : "";
        comparisons += first >= second ? (first + " >= " + second + "\n") : "";
        comparisons += first != second ? (first + " != " + second) : "";
        System.out.print(comparisons);
    }
}