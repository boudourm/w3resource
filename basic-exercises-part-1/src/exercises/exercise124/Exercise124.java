package exercises.exercise124;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise124 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        System.out.println("Array : " + Arrays.toString(array));
        System.out.print("Input the target : ");
        int target = input.nextInt();
        int begin = 0;
        int end = array.length - 1;
        while (begin < end) {
            int middle = (begin + end) / 2;
            if (array[middle] == target) {
                System.out.print(middle);
                return;
            } else if (array[middle] < target) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.print(begin == 0 ? begin : begin + 1);
    }
}