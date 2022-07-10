package exercises.exercise15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Black", "White", "Pink"}));
        List<String> list2 = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Black", "Pink"}));
        System.out.println("List of first array: " + list1);
        System.out.println("List of second array: " + list2);
        list1.addAll(list2);
        System.out.print("New array: " + list1);
    }
}