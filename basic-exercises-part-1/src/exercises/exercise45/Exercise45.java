package exercises.exercise45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise45 {
    private static final Scanner input = new Scanner(System.in);
    private static final String URL_BASE = "./basic-exercises-part-1";

    public static void main(String[] args) throws IOException {
        System.out.println("Input file path (relative base = " + URL_BASE + ") : ");
        String url = input.nextLine();
        System.out.print(url + " : " + String.format("%,d bytes", Files.size(Paths.get(url))));
    }
}