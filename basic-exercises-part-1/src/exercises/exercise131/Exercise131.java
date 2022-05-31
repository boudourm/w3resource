package exercises.exercise131;

import java.util.*;

public class Exercise131 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("The length of the original array is: " + array.length);

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < list.size(); ) {
            if (set.contains(list.get(i)))
                list.remove(i);
            else {
                set.add(list.get(i));
                i++;
            }
        }
        array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));
        System.out.print("After removing duplicates, the new length of the array is: " + array.length);
    }
}