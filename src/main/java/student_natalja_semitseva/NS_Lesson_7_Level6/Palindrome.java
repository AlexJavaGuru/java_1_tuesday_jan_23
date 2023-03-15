package student_natalja_semitseva.NS_Lesson_7_Level6;


public class Palindrome {

    public boolean isPalindrome(String text) {
        String newText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        char[] chars = text.toCharArray();
        for (int i = 0; i < newText.length() / 2; i++) {
            if (chars[i] != chars[text.length() - 1 - i]) {
                return false;

            }
        }
        return true;

    }
}