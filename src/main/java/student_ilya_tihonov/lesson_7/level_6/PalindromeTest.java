package student_ilya_tihonov.lesson_7.level_6;

public class PalindromeTest {

    public static void main(String[] args) {
        testIsPalindrome();
        testIsPalindromeNegative();
    }

    public static void testIsPalindrome() {
        String[] palindromes = {"racecar", "level", "A man a plan a canal Panama", "", "a"};
        String[] nonPalindromes = {"hello", "world", "not a palindrome"};

        for (String p : palindromes) {
            if (!Palindrome.isPalindrome(p)) {
                System.out.println("ERROR: " + p + " should be a palindrome");
            }
        }

        for (String np : nonPalindromes) {
            if (Palindrome.isPalindrome(np)) {
                System.out.println("ERROR: " + np + " should not be a palindrome");
            }
        }
    }
    public static void testIsPalindromeNegative() {
        String text = "hello world";
        boolean result = Palindrome.isPalindrome(text);
        if (result) {
            System.out.println("Test failed: expected false, but got true");
        } else {
            System.out.println("Test passed: got false as expected");
        }
    }

}
