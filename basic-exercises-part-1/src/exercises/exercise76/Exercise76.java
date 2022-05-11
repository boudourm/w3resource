package exercises.exercise76;

import java.util.Scanner;

public class Exercise76 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integerArray1 = {50, -20, 0, 30, 40, 60, 12};
        int[] integerArray2 = {45, 20, 10, 20, 30, 50, 11};

        System.out.print(
                integerArray1[0] == integerArray2[0] ||
                        integerArray1[integerArray1.length - 1] ==
                                integerArray2[integerArray2.length - 1]);
    }
}