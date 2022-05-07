package exercises.exercise39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise39 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> firsts = Arrays.asList(1, 2, 3, 4);
        int total = 0;
        for (Integer first : firsts) {
            List<Integer> seconds = new ArrayList<Integer>();
            seconds.addAll(firsts);
            seconds.remove(first);
            for (Integer second : seconds) {
                List<Integer> thirds = new ArrayList<Integer>();
                thirds.addAll(seconds);
                thirds.remove(second);
                for (Integer third : thirds) {
                    System.out.println(first + "" + second + "" + third);
                    total++;
                }
            }
        }
        System.out.print("Total number of three-digit-number is " + total);
    }
}