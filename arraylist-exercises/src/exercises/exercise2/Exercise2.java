package exercises.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(Arrays.asList(new String[]{
                "Red",
                "Green",
                "Orange",
                "White",
                "Black"}));

        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}