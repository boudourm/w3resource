package exercises.exercise20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Black"}));
        System.out.println("Original array list: " + list);
        list.ensureCapacity(6);
        list.addAll(Arrays.asList(new String[]{"White", "Pink", "Yellow"}));
        System.out.println("New array list: " + list);
    }
}