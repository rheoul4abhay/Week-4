package FileHandling;

import java.io.*;

public class ReadWriteTextFile {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/FileHandling/source.txt";
        String destinationFile = "src/main/java/FileHandling/destination.txt";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("The source file does not exist.");
        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
