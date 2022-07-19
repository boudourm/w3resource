package exercises.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Orange", "White", "Black"}));
        System.out.println("First element: " + arrayList.get(0));
        System.out.println("Third element: " + arrayList.get(2));
    }
}