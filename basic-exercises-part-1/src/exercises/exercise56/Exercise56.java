package exercises.exercise56;

import java.util.Scanner;

public class Exercise56 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the beginning of the range: ");
        int beginning = input.nextInt();
        System.out.print("Input the end of the range: ");
        int end = input.nextInt();
        System.out.print("Input the divider : ");
        int divider = input.nextInt();
        System.out.println("Number of integers divisible by " + divider + " : " +
                (beginning % divider == 0 ? (((end - beginning + 1) / divider) + 1) :
                        ((end - beginning + 1) / divider)));
    }
}