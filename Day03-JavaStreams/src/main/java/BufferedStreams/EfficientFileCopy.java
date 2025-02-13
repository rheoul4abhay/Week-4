package BufferedStreams;

import java.io.*;

public class EfficientFileCopy {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/BufferedStreams/source.txt";
        String destinationFileBuffered = "src/main/java/BufferedStreams/destination_buffered.txt";
        String destinationFileUnbuffered = "src/main/java/BufferedStreams/destination_unbuffered.txt";

        long startBuffered = System.nanoTime();
        copyFileWithBufferedStreams(sourceFile, destinationFileBuffered);
        long endBuffered = System.nanoTime();
        long durationBuffered = endBuffered - startBuffered;

        long startUnbuffered = System.nanoTime();
        copyFileWithUnBufferedStreams(sourceFile, destinationFileUnbuffered);
        long endUnbuffered = System.nanoTime();
        long durationUnbuffered = endUnbuffered - startUnbuffered;

        System.out.println("Buffered Streams Time: " + durationBuffered + " nanoseconds");
        System.out.println("Unbuffered Streams Time: " + durationUnbuffered + " nanoseconds");
    }

    public static void copyFileWithBufferedStreams(String sourceFile, String destinationFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered file copy completed.");
        } catch (IOException e) {
            System.out.println("Error during buffered file copy: " + e.getMessage());
        }
    }

    public static void copyFileWithUnBufferedStreams(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Unbuffered file copy completed.");
        } catch (IOException e) {
            System.out.println("Error during unbuffered file copy: " + e.getMessage());
        }
    }
}
