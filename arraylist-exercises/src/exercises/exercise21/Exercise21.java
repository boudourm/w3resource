package exercises.exercise21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green"}));
        System.out.println("Original array list : " + list);
        System.out.println("Replace second element with 'White'.");
        list.set(1, "White");
        System.out.println(list);
    }
}