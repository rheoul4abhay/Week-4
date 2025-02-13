package FilterStreams;

import java.io.*;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/FilterStreams/source.txt";
        String destinationFile = "src/main/java/FilterStreams/destination.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                // Convert uppercase letters to lowercase
                char lowerCaseChar = Character.toLowerCase((char) character);
                writer.write(lowerCaseChar);
            }
            System.out.println("File contents converted to lowercase and saved.");
        } catch (IOException e) {
            System.out.println("Error during file handling: " + e.getMessage());
        }
    }
}
