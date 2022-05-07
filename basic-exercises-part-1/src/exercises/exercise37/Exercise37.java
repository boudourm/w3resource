package exercises.exercise37;

import java.util.Scanner;

public class Exercise37 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Input a string: ");
        char[] chars = input.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            Thread.sleep(260);
            System.out.print(chars[i]);
        }
    }
}