import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalysisTool {

    public static void main(String[] args) {
        String filePath = "sample.txt"; // Replace with the actual path to your text file

        try {
            String content = readFile(filePath);
            int sentenceCount = countSentences(content);
            Map<String, Integer> wordFrequency = calculateWordFrequency(content);

            System.out.println("Sentence Count: " + sentenceCount);
            System.out.println("Word Frequency:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        return sentences.length;
    }

    private static Map<String, Integer> calculateWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text.toLowerCase());

        while (matcher.find()) {
            String word = matcher.group();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }
}
