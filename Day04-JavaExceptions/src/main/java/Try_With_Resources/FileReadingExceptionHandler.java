package Try_With_Resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExceptionHandler {
    public static void main(String[] args) {
        String filepath = "src/main/java/Try_With_Resources/info";
        try(BufferedReader bfr = new BufferedReader(new FileReader(filepath))){
            String line = bfr.readLine();
            System.out.println(line);
        } catch(FileNotFoundException e){
            System.out.println("File not found!");
        } catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}
