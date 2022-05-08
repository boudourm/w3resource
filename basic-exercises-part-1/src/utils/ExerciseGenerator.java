package utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ExerciseGenerator {

    public static void main(String[] args) throws IOException {
        File exercises = new File("./basic-exercises-part-1/src/exercises");
        String[] exercisesArray = exercises.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });

        List<String> exercisesList = Arrays.asList(exercisesArray);
        int newExerciseOrder = 0;
        for (String exercise : exercisesList) {
            int order = Integer.parseInt(exercise.substring("exercise".length()));
            if (newExerciseOrder <= order)
                newExerciseOrder = order + 1;
        }
        //README.md
        String solution = "https://www.w3resource.com/java-exercises/basic/java-basic-exercise-" + newExerciseOrder + ".php";
        HashMap<String, String> data = fetchExerciseData(solution);
        String content = "###[Java Basic: Exercise-" + newExerciseOrder + "](" + solution + ")\n***\n" +
                data.get("statement") +
                "\n\n***\n" +
                "_Sample output:_\n" +
                data.get("sampleOutput");
        String url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder;
        new File(url).mkdirs();
        url += "/README.md";
        Path readme = Paths.get(url);
        Files.writeString(readme, content);

        //Exercisei.java
        content = "package exercises.exercise" + newExerciseOrder + ";\n\n" +
                "import java.util.Scanner;\n\n" +
                "public class Exercise" + newExerciseOrder + " {\n" +
                "private static final Scanner input = new Scanner(System.in);\n\n" +
                "    public static void main(String[] args) {\n\n" +
                "    }\n}";
        url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder + "/Exercise" + newExerciseOrder + ".java";
        Path exercise = Paths.get(url);
        Files.writeString(exercise, content);
    }

    private static HashMap<String, String> fetchExerciseData(String exercise) throws IOException {
        URL url = new URL(exercise);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();

        BufferedReader raw = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );
        String inputLine = "";
        StringBuffer content = new StringBuffer();
        String p = "<p>Write a Java program";
        String beginPre = "<pre class=\"output\">";
        String endPre = "</pre>";
        String sampleOutPut = "", statement = "";
        while ((inputLine = raw.readLine()) != null) {
            if (inputLine.contains(beginPre)) {
                sampleOutPut = inputLine;
                while (!(inputLine = raw.readLine()).contains(endPre)) {
                    sampleOutPut += "\n" + inputLine;
                }
                sampleOutPut += "\n" + inputLine;
            } else if (inputLine.contains(p)) {
                statement = inputLine;
            } else continue;
        }

        raw.close();
        connection.disconnect();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("statement", statement);
        map.put("sampleOutput", sampleOutPut);
        return map;
    }

}
