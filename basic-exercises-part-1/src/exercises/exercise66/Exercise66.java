package exercises.exercise66;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise66 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (BigInteger.valueOf(i).isProbablePrime(n))
                sum += i;
        }
        System.out.print("Sum of the prime numbers till 100: " + sum);
    }
}