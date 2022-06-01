package exercises.exercise132;

import java.util.*;

public class Exercise132 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("The length of the original array is: " + array.length);

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); ) {
            if (map.containsKey(list.get(i))) {
                if (map.get(list.get(i)) == 2)
                    list.remove(i);
                else {
                    map.replace(list.get(i), map.get(list.get(i)) + 1);
                    i++;
                }
            } else {
                map.put(list.get(i), 1);
                i++;
            }
        }

        array = list.toArray(new Integer[list.size()]);
        System.out.print("After removing duplicates, the new length of the array is: " + array.length);
    }
}