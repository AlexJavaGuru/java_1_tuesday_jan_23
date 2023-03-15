package student_natalja_semitseva.NS_Lesson_7_Level6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.testIsPalindrome();

    }

    public void testIsPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "mamam";
        boolean actualResult = palindrome.isPalindrome(text);
        checkResult(actualResult, "testIsPalindrome");


    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test: " + testName + " has passed!");
        } else {
            System.out.println("Test: " + testName + " failed!");
        }
    }
}