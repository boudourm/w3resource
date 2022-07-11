package exercises.exercise14;

import java.util.*;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Black", "White", "Pink"}));
        System.out.println("Array list before Swap:");
        System.out.println(list);
        Collections.swap(list, 0, 2);
        System.out.print(list);
    }
}