package exercises.exercise50;

import java.util.ArrayList;
import java.util.List;

public class Exercise50 {

    public static void main(String[] args) {
        final int n = 100;
        List<Integer> divisibleBy3 = new ArrayList<Integer>();
        List<Integer> divisibleBy5 = new ArrayList<Integer>();
        List<Integer> divisibleByBoth = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            int remainerFrom3 = i % 3;
            int remainerFrom5 = i % 5;
            if (remainerFrom3 == 0) divisibleBy3.add(i);
            if (remainerFrom5 == 0) divisibleBy5.add(i);
            if (remainerFrom3 + remainerFrom5 == 0) divisibleByBoth.add(i);
        }
        System.out.println("Divided by 3:\n" +
                divisibleBy3);
        System.out.println("\nDivided by 5:\n" +
                divisibleBy5);
        System.out.print("\nDivisible by 3 & 5:\n" +
                divisibleByBoth);
    }
}