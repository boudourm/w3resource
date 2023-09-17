package exercises.exercise15;

import java.io.*;
import java.util.Scanner;

public class Exercise15 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise15\\files\\plant.txt";

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File(PATH))
        );
        System.out.println("Write text (line by line) into your plain text file : (end it with \"null\")");
        String line = input.nextLine();
        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = input.nextLine();
        } while (!line.equals("null"));
        bufferedWriter.close();

        System.out.println("Lets read the file : ");
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(new File(PATH))
        );
        line = bufferedReader.readLine();
        do {
            System.out.println(line);
            line = bufferedReader.readLine();
        } while (line != null);
        bufferedReader.close();
    }
}