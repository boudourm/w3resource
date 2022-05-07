package exercises.exercise40;

import java.nio.charset.Charset;

public class Exercise40 {

    public static void main(String[] args) {
        System.out.println("List of available character sets:");
        Charset.availableCharsets().values().forEach(charset -> {
            System.out.println(charset);
        });
    }
}
