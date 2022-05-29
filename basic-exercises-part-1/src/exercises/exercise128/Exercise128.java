package exercises.exercise128;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise128 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array1 = {10, 2, 38, 22, 38, 23};
        Integer[] array2 = {10, 2, 38, 23, 38, 23, 21};

        System.out.println("Original array: " + Arrays.toString(array1));
        System.out.println("Median of the said  array of integers: " + getMedianOf(array1));
        System.out.println();
        System.out.println("Original array: " + Arrays.toString(array2));
        System.out.print("Median of the said array of integers: " + getMedianOf(array2));
    }

    private static Integer getMedianOf(Integer array[]) {
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 0)
            return (list.get(size / 2) + list.get(size / 2 - 1)) / 2;
        else
            return list.get(size / 2);
    }
}