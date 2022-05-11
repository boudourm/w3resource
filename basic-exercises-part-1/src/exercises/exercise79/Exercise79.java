package exercises.exercise79;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise79 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //for this solution to work the integers must be objects
        Integer[] originalArray = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        Collections.rotate(Arrays.asList(originalArray), -1);
        System.out.print("Rotated Array: " + Arrays.asList(originalArray));
    }
}