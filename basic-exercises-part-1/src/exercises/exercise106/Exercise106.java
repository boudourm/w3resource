package exercises.exercise106;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise106 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {11, 15, 13, 10, 45, 20};
        System.out.println("Original Array : " + Arrays.toString(array));
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        list.add(list.remove(0));
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("New Array : " + Arrays.toString(newArray));
    }
}