package exercises.exercise17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise17 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise17\\files\\file.toread";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File(PATH))
        );
        List<String> lines = bufferedReader.lines().
                limit(3).collect(Collectors.toList());
        bufferedReader.close();
        for (String line : lines) {
            System.out.println(line);
        }
    }
}