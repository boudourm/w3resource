package exercises.exercise96;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise96 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 70, 80, 50, 20, 13, 50};
        System.out.println("Array : " + Arrays.toString(array));
        boolean thereIsATen = false;
        for (int number : array) {
            if (number == 20) {
                if (thereIsATen) {
                    System.out.print(true);
                    return;
                }
            } else if (!thereIsATen) {
                thereIsATen = number == 10;
            }
        }
        System.out.print(false);
    }
}