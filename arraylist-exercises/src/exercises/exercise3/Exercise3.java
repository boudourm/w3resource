package exercises.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));
        System.out.println(arrayList);
        arrayList.add(0, "Pink");
        System.out.print(arrayList);
    }
}