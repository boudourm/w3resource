package exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String string = "w3resource.com";
        System.out.println("Original String : " + string);
        System.out.print("Input an index : ");
        int index = input.nextInt();
        System.out.println("UnicodePointBefore(" + index + ") = " + string.codePointBefore(index));
        System.out.print("Input an index : ");
        index = input.nextInt();
        System.out.print("UnicodePointBefore(" + index + ") = " + string.codePointBefore(index));
    }
}