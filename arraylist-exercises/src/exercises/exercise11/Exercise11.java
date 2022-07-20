package exercises.exercise11;

import java.util.*;

public class Exercise11 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(new String[]{"Red", "Green", "Orange", "White", "Black"}));
        System.out.println("List before reversing : ");
        System.out.println(list);
        System.out.println("List after reversing : ");
        Collections.reverse(list);
        System.out.print(list);
    }
}