package MapInterface.wordFrequencyCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static Map<String, Integer> wordFrequencyCounter(String str){
        String[] wordsArray = str.split(" ");
        Map<String, Integer> mpp = new HashMap<>();
        for(String word: wordsArray){
            String key = word.toLowerCase();
            if(word == "") continue;
            if(mpp.containsKey(key)){
                mpp.put(key, mpp.get(key) + 1);
            } else{
                mpp.put(key, 1);
            }
        }
        return mpp;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String filepath = "src/main/java/MapInterface/wordFrequencyCounter/sample.txt";
        try (BufferedReader bfr = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = bfr.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error while reading file : " + e.getMessage());
        }
        String str = String.valueOf(sb);
        System.out.println("File read -> " + str);
        str = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println("Word frequency map of sample file -> " + wordFrequencyCounter(str));
    }
}
