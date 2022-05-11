package exercises.exercise81;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise81 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] originalArray = {20, 30, 40};
        int[] newArray = originalArray.clone();
        newArray[0] = originalArray[originalArray.length - 1];
        newArray[newArray.length - 1] = originalArray[0];
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.print("New array after swaping the first and last elements : " +
                Arrays.toString(newArray));
    }
}