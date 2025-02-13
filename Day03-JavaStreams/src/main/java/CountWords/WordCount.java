import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String fileName = "src/main/java/CountWords/sample.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
            sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < 5 && i < sortedList.size(); i++) {
                Map.Entry<String, Integer> entry = sortedList.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
