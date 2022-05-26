package exercises.exercise129;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise129 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        System.out.println("Source Array : " + Arrays.toString(array));
        Set<Integer> set = new HashSet<Integer>();
        for (Integer integer : array) {
            if (set.contains(integer))
                set.remove(integer);
            else
                set.add(integer);
        }
        System.out.print(set.toArray()[0] + " appease only once");
    }
}