package JUnit.BasicJUnitProblems.StringUtils;

public class StringUtils {

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        String reverseString = reverse(str);
        return str.equalsIgnoreCase(reverseString);
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i < str.length();i++){
            int newAscii = (int)(str.charAt(i)) - 32;
            sb.append((char)(newAscii));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
        System.out.println("Is Palindrome: " + isPalindrome(str));
        System.out.println("Uppercase: " + toUpperCase(str));
    }
}
