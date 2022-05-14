package exercises.exercise93;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise93 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {10, 10, 2, 4, 20, 20};
        System.out.println("Original Array: " + Arrays.toString(array));
        boolean thereAreTens = false, thereAreTwenties = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 10 && array[i] == 10) {
                if (thereAreTwenties) {
                    System.out.print(false);
                    return;
                }
                thereAreTens = true;
            } else if (array[i] == 20 && array[i] == 20) {
                if (thereAreTens) {
                    System.out.print(false);
                    return;
                }
                thereAreTwenties = true;
            }
        }

        System.out.print(thereAreTens || thereAreTwenties);
    }

}