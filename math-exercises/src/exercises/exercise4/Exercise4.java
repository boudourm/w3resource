package exercises.exercise4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
/*
Original number: 451.3256531
Rounded upto 4 decimal: 451.3257
 */
        System.out.print("Input original number: ");
        BigDecimal bigDecimal = new BigDecimal(input.nextLine());
        System.out.print("Input the number of desired decimals: ");
        int places = input.nextInt();
        System.out.print("Rounded up to " + places + " decimal: " + bigDecimal.setScale(places, RoundingMode.HALF_UP));
    }
}