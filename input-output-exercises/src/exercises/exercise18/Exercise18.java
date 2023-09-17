package exercises.exercise18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise18 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise18\\files\\file.toread";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File(PATH))
        );
        String longestWord = "";
        String line = bufferedReader.readLine();
        do {
            for (String word : line.split(" ")) {
                if (word.length() > longestWord.length())
                    longestWord = word;
            }
            line = bufferedReader.readLine();
        } while (line != null);
        System.out.print(longestWord);
        bufferedReader.close();
    }
}