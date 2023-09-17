package exercises.exercise20;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise20 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a number : ");
        int number = input.nextInt();
        SortedSet<Integer> sieve = new TreeSet<Integer>();
        for (int i = 2; i <= number; i++)
            sieve.add(i);

        for (int i = 2; i <= (int) Math.sqrt(number); i++)
            for (int j = i * i; j <= number; j += i)
                sieve.remove(j);
        
        System.out.print("Prime numbers less than " + number + " : " + sieve);
    }
}