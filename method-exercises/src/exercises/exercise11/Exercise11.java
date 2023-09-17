package exercises.exercise11;

import java.util.Scanner;

public class Exercise11 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = input.nextLine();
        System.out.print("Is password valid : " + isValidPassword((password)));
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;
        int digits = 0;
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                digits++;
            } else if (!Character.isLetter(character)) {
                return false;
            }
        }
        if (digits < 2) return false;
        return true;
    }
}