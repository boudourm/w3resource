package exercises.exercise7;

import java.util.Scanner;

public class Exercise7 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a Rman Number: ");
        String roman = input.nextLine();
        System.out.print("Equivalent arabic number = " + convertRomanNumberToArabic(roman));
    }

    private static int convertRomanNumberToArabic(String roman) {
        int arabic = 0;
        if (roman.length() == 1) return RomanDigit.valueOf(roman).getArabicValue();

        for (int i = 0; i < roman.length() - 1; i = i + 2) {
            RomanDigit firstDigit = RomanDigit.valueOf(roman.charAt(i) + "");
            RomanDigit secondDigit = RomanDigit.valueOf(roman.charAt(i + 1) + "");
            if (firstDigit.compareTo(secondDigit) == -1)
                arabic += secondDigit.getArabicValue() - firstDigit.getArabicValue();
            else
                arabic += secondDigit.getArabicValue() + firstDigit.getArabicValue();
        }
        if (roman.length() % 2 == 1)
            arabic += RomanDigit.valueOf(roman.charAt(roman.length() - 1) + "").getArabicValue();

        return arabic;
    }
}