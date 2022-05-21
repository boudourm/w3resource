package exercises.exercise119;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise119 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8};
        System.out.println("Array : " + Arrays.toString(array));
        System.out.print("Input the element to lookup : ");
        int element = input.nextInt();
        //the array is not sorted so the best choice is sequential search
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                position = i;
                break;
            }
        }
        System.out.print("Position of " + element + " is " + position);

    }
}