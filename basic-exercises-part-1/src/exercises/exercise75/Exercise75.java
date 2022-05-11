package exercises.exercise75;

import java.util.Scanner;

public class Exercise75 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integerArray = {50, -20, 0, 30, 40, 60, 10};
        System.out.print(integerArray[0] == integerArray[integerArray.length - 1]);
    }
}