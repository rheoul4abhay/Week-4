package Regex.BasicProblems.ValidateHexColorCode;

import java.util.regex.*;

public class HexCodeValidator {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        String[] testHexCodes = {"#FFA500", "#ff4500", "FFF000","#123", "#AZaz12"};

        for(String code: testHexCodes){
            System.out.println(code + " -> " + ((pattern.matcher(code).matches()) ? "valid" : "invalid"));
        }
    }
}
