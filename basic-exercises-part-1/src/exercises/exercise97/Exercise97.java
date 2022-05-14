package exercises.exercise97;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise97 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 20, 10, 50, 20, 13, 50};
        System.out.println("Array :" + Arrays.toString(array));
        System.out.print("Input an a specified number : ");
        int specifiedNumber = input.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == specifiedNumber) {
                if (array[i + 1] == specifiedNumber) {
                    System.out.print(true);
                    return;
                }
            } else if (i > 0 && array[i - 1] == specifiedNumber &&
                    array[i + 1] == specifiedNumber) {
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);


    }
}