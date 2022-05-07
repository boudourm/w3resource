package exercises.exercise17;

import java.util.Scanner;

public class Exercise17 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        String firstBinaryString = input.next();
        System.out.print("Input second binary number: ");
        String secondBinaryString = input.next();
        String resultMassage = "Sum of two binary numbers: ";
        System.out.print(resultMassage + binaryAdditionSum(firstBinaryString, secondBinaryString));
        System.out.println("\t- binaryAdditionSum");
        System.out.print(resultMassage + decimalConversionBinarySum(firstBinaryString, secondBinaryString));
        System.out.println("\t- decimalConversionBinarySum");
        System.out.print(resultMassage + integerWrapperBinarySum(firstBinaryString, secondBinaryString));
        System.out.print("\t- integerWrapperBinarySum");
    }

    private static String integerWrapperBinarySum(String firstString, String secondString) {
        int firstNumber = Integer.parseInt(firstString, 2);
        int secondNumber = Integer.parseInt(secondString, 2);
        return Integer.toBinaryString(firstNumber + secondNumber);
    }

    private static String decimalConversionBinarySum(String firstString, String secondString) {
        return decimalIntToBinaryString(binaryStringToDecimalInt(firstString) + binaryStringToDecimalInt(secondString));
    }

    private static String binaryAdditionSum(String firstString, String secondString) {
        String longerString, shorterString;
        if (firstString.length() < secondString.length()) {
            longerString = secondString;
            shorterString = firstString;
        } else {
            longerString = firstString;
            shorterString = secondString;
        }

        boolean remain = false;
        String sum = "";
        for (int i = 0; i < shorterString.length(); i++) {
            char bit1 = shorterString.charAt(shorterString.length() - i - 1);
            char bit2 = longerString.charAt(longerString.length() - i - 1);
            if (bit1 == bit2) {
                sum = (remain ? "1" : "0") + sum;
                if (bit1 == '0') remain = false;
                else if (bit1 == '1') remain = true;
            } else sum = (remain ? "0" : "1") + sum;
        }
        for (int i = shorterString.length(); i < longerString.length(); i++) {
            char bit = longerString.charAt(longerString.length() - i);
            if (bit == '1') sum = (remain ? "0" : "1") + sum;
            else {
                sum = (remain ? "1" : "0") + sum;
                remain = false;
            }
        }

        return remain ? ("1" + sum) : sum;
    }

    private static int binaryStringToDecimalInt(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++)
            decimal += Math.pow(2, binary.length() - i - 1) * Integer.parseInt(binary.charAt(i) + "");
        return decimal;
    }

    private static String decimalIntToBinaryString(int decimal) {
        int bits = 0;
        while (decimal > Math.pow(2, bits))
            bits++;
        if (bits > 0) bits--;
        String binary = "";
        while (bits >= 0) {
            int powerOf2 = (int) Math.pow(2, bits);
            if (decimal >= powerOf2) binary += "1";
            else binary += "0";
            decimal = (int) (decimal % Math.pow(2, bits));
            bits--;
        }
        return binary;
    }
}