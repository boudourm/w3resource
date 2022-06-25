package exercises.exercise12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise12 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Orange", "White", "Black"}));
        System.out.println("Original list: " + list);
        List<String> subList = list.subList(0, 2);
        System.out.print("List of first three elements: " + subList);
    }
}