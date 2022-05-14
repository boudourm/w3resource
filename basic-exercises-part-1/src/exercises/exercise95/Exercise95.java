package exercises.exercise95;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise95 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> elements = new ArrayList<String>();
        System.out.print("Input the length of the array: ");
        int length = input.nextInt();
        for (int i = 0; i < length; i++)
            elements.add(Integer.toString(i));
        String[] array = elements.toArray(new String[0]);
        System.out.print("New Array: " + Arrays.toString(array));
    }
}