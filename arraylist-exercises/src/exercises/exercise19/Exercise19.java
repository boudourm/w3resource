package exercises.exercise19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise19 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);
        list.addAll(0, Arrays.asList(new String[]{"Red", "Green", "Black", "White", "Pink"}));
        System.out.println("Original array list: " + list + " of siez: " + list.size());
        list.trimToSize();
        System.out.println("Let trim to size the above array: " + list + " of size : " + list.size());
    }
}