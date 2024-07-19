import java.util.List;
import java.util.ArrayList;


public class Palindrome {
    public static void main(String[] args) {
        String s = "babad";
        int palLength = 0;
        String largestPal = "";
        List<String> palindrome = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j))) {
                    palindrome.add(s.substring(i, j));
                }
            }
        }

        for (int i = 0; i < palindrome.size(); i++) {
            if (palLength < palindrome.get(i).length()) {
                palLength = palindrome.get(i).length();
                largestPal = palindrome.get(i);
            }
        }
        System.out.println(largestPal);
    }

    public static boolean isPalindrome(String check) {
        String str = "";
        for (int i = check.length()-1; i >= 0; i--) {
            str = str + check.charAt(i);
        }
        if (check.equals(str) && str.length()>1)
            return true;

        return false;
    }
}
