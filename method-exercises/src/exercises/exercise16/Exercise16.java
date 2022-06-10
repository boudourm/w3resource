package exercises.exercise16;

import exercises.exercise16.datastructure.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise16 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(findTwinPrimeNumbersLessThan(100));
    }

    private static List<Pair> findTwinPrimeNumbersLessThan(int n) {
        List<Pair> twins = new ArrayList<Pair>();
        for (Integer i = 2; i < n - 2; ) {
            if (isPrime(i) && !isPrime(i + 1) && isPrime(i + 2)) {
                twins.add(new Pair(i, i + 2));
                i = i + 2;
            } else {
                i++;
            }
        }
        return twins;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}