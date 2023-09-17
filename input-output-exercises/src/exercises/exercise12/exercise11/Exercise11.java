package exercises.exercise12.exercise11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise11 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise1\\Exercise1.java";

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File(PATH));
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String line = "";
        do {
            line = bufferReader.readLine();
            if (line != null)
                System.out.println(line);
            else
                break;
        } while (true);
        fileReader.close();
        bufferReader.close();
    }
}