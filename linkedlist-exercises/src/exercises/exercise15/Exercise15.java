package exercises.exercise15;

import java.util.*;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(Arrays.asList(new String[]{"Red", "Green", "Black", "Pink", "Orange"}));
        System.out.println("The Original linked list: " + list);
        Collections.swap(list, list.indexOf("Red"), list.indexOf("Black"));
        System.out.print("The New linked list after swap: " + list);
    }
}