package utils;

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DOMReader {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        URL url = new URL("https://www.w3resource.com/java-exercises/basic/java-basic-exercise-49.php");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();

        BufferedReader raw = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );
        String inputLine = "";
        byte step = -1;
        StringBuffer content = new StringBuffer();
        String tag = "head";
        while ((inputLine = raw.readLine()) != null) {
            //<p>Write a Java program
            if (inputLine.contains("<pre class=\"output\">"))
                System.out.println(inputLine);
//            if (inputLine.contains("<img") || inputLine.contains("<nav") || inputLine.contains("</nav"))
//                continue;
//            if (inputLine.contains("<header")) {
//                while ((inputLine = raw.readLine()) != null) {
//                    if (inputLine.contains("</header"))
//                        break;
//                }
//                inputLine = raw.readLine();
//            }
//            step = emptyTag(inputLine, step, content, tag);
//            if (step == 1) {
//                step = -1;
//                tag = "script";
//            }
        }

        raw.close();
        connection.disconnect();

        String html = content.toString();

        String fileName = "./basic-exercises-part-1/src/utils/exercise.html";
        Path exercise = Paths.get(fileName);
        Files.writeString(exercise, html);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document doc = db.parse(new File(fileName));
//        //doc.getDocumentElement().normalize();
//        System.out.print(doc.getDocumentElement().getNodeName());
    }

    private static byte emptyTag(String inputLine, byte step, StringBuffer content, String tag) {
        if (step == -1) {
            int begin_tag = inputLine.indexOf(tag.equals("script") ? ("<" + tag) : ("<" + tag + ">"));
            if (begin_tag != -1) {
                step = 0;
            } else {
                content.append(inputLine);
            }
        } else if (step == 0) {
            int end_tag = inputLine.indexOf("</" + tag + ">");
            if (end_tag != -1) {
                step = 1;
            }
        } else {
            content.append(inputLine);
        }
        return step;
    }
}
