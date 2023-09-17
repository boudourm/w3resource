package exercises.exercise14;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger value = new BigInteger("9223372036854775807");
        System.out.println("BigInteger value: " + value);
        System.out.println("Convert the said BigInteger to a long value: " + value.longValue());
        System.out.println("Convert the said BigInteger to an int value: " + value.intValue());
        System.out.println("Convert the said BigInteger to an int value: " + value.shortValue());
        System.out.println("Convert the said BigInteger to a byte" + value.byteValue());
        System.out.print("Convert the said BigInteger to exact long: " + value.longValueExact());
    }
}