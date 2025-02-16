package Regex.AdvancedProblems.ValidateIP_Address;

import java.util.regex.*;

public class ValidateIP_Address {

    public static boolean isValidIPv4(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}"
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "0.0.0.0",
                "256.100.50.25",
                "192.168.01.1",
                "192.168.1",
                "192.168.1.1.1",
                "192.168.1.a"
        };

        for (String ip : testIPs) {
            System.out.println(ip + " -> " + (isValidIPv4(ip) ? "valid" : "invalid"));
        }
    }
}
