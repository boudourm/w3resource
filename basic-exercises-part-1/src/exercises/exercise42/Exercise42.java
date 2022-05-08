package exercises.exercise42;

import java.io.Console;

public class Exercise42 {

    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.print("The console is not available.");
            return;
        }
        char[] password = console.readPassword("Input your Password: ");
        System.out.print("Your password was: " + password);
    }
}