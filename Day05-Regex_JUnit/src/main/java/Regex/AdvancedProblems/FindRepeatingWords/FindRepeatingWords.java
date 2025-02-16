package Regex.AdvancedProblems.FindRepeatingWords;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test";

        String regex = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(regex);

    }
}
