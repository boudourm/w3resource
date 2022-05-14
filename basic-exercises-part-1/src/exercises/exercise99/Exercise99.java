package exercises.exercise99;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise99 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 20, 10, 20, 40, 20, 50};
        System.out.println("Array : " + Arrays.toString(array));
        System.out.print("Input specified number : ");
        int specifiedNumber = input.nextInt();
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] != specifiedNumber && array[i + 1] != specifiedNumber) {
                System.out.println(false);
                return;
            }
        }
        System.out.print(true);
    }
}