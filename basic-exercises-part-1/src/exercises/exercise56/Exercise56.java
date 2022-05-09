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
        System.out.println("Numbers divisible by " + divider + " : ");
        int increment = 1;
        boolean period = false;
        for (int i = beginning; i <= end; i += increment) {
            if (period) System.out.println(i);
            else if (i % divider == 0) {
                System.out.println(i);
                increment = divider;
                period = true;
            }
        }
    }
}