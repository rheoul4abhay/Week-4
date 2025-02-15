package CheckedException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionHandler {

    public static void readFile(String filePath){
        try(BufferedReader bfr = new BufferedReader(new FileReader(filePath))){
            String line = "";
            while((line = bfr.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("File not found");
            return;
        }
    }
    public static void main(String[] args){
        String filePath = "src/main/java/CheckedException/data";
        readFile(filePath);
    }
}
