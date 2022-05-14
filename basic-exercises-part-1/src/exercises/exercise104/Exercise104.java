package exercises.exercise104;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise104 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {11, 15, 13, 10, 45, 20, 33, 53};
        System.out.println("Original Array: " + Arrays.toString(array));
        List<Integer> numbersBeforeLastTen = new ArrayList<Integer>();
        boolean tenIsMet = false;
        for (int i = array.length - 1; i >= 0; i--) {
            if (tenIsMet)
                numbersBeforeLastTen.add(0, array[i]);
            else if (array[i] == 10) {
                tenIsMet = true;
            }
        }
        Integer[] newArray = numbersBeforeLastTen.toArray(new Integer[0]);
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}