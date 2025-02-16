package JUnit.BasicJUnitProblems.FileProcessor;

import java.io.*;

public class FileProcessor {

    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("File write successful");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String readFromFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            return "File not found";
        } catch (IOException e) {
            return "General IO error: " + e.getMessage();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String readFileDestination = "src/main/java/JUnit/BasicJUnitProblems/FileProcessor/sample";
        String writeDestination = "src/main/java/JUnit/BasicJUnitProblems/FileProcessor/new_file";

        System.out.println("Data read: " + readFromFile(readFileDestination));

        writeToFile(writeDestination, "This is some form of text which is to be written in a new file");
    }
}
