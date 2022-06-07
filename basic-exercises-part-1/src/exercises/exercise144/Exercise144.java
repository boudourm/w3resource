package exercises.exercise144;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise144 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] nums = {1, 4, 6, 7, 6, 2};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.print("Input a value to remove : ");
        Integer value = input.nextInt();
        nums = removeValueUsingList(nums, value);
        System.out.print("The length of the new array is : " + nums.length);
    }


    private static Integer[] removeValueUsingList(Integer[] nums, Integer value) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));
        nums = null;
        list.removeIf(integer -> integer == value);
        nums = list.toArray(new Integer[list.size()]);
        list = null;
        return nums;
    }

}