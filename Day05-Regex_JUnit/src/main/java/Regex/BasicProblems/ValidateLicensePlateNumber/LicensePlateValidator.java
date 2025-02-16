package Regex.BasicProblems.ValidateLicensePlateNumber;
import java.util.regex.*;

public class LicensePlateValidator {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[\\d]{4}$";
        Pattern pattern = Pattern.compile(regex);

        String[] testLicensePlates = {"IN1234", "IN123", "INDIA1234", "1INDIA", "in1234", "IN@1234", "In1234", "IN0123"};
        for(String plate: testLicensePlates){
            System.out.println(plate + " -> " + (pattern.matcher(plate).matches() ? "valid" : "invalid"));
        }
    }
}
