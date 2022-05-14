package exercises.exercise94;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Exercise94 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] array = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array));
        Queue<Integer> evenIndexes = new PriorityQueue<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenIndexes.add(i);
            else if (!evenIndexes.isEmpty()) {
                Integer temp = array[evenIndexes.peek()];
                array[evenIndexes.remove()] = array[i];
                array[i] = temp;
                evenIndexes.add(i);
            }
        }
        System.out.println("New Array: " + Arrays.toString(array));
    }
}