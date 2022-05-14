package exercises.exercise103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise103 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {11, 10, 13, 10, 45, 20, 33, 53};
        System.out.println("Original Array: " + Arrays.toString(array));
        List<Integer> list = new ArrayList<Integer>();
        boolean tenIsMet = false;
        for (Integer number : array) {
            if (number == 10) {
                if (!list.isEmpty())
                    list.removeAll(list);
                else
                    tenIsMet = true;
            } else if (tenIsMet) {
                list.add(number);
            }
        }
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.print("New Array: " + Arrays.toString(newArray));
    }
}