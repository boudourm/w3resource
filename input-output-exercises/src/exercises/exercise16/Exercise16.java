package exercises.exercise16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise16 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise16\\files\\plain.txt";

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File(PATH), true)
        );
        System.out.println("Write text to append to plain.txt (line by line ending with \"null\"): ");
        String line = input.nextLine();
        do {
            bufferedWriter.append(line);
            bufferedWriter.append("\n");
            line = input.nextLine();
        } while (!line.equals("null"));
        bufferedWriter.close();
    }
}