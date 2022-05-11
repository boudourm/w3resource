package exercises.exercise78;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise78 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {5, 7};
        System.out.println("Original Array: " + Arrays.toString(array));
        List list = Arrays.asList(array);
        System.out.print(list.contains(4) || list.contains(7));
    }
}