package student_dmitry_kupcus.lesson_7;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTrue();
        palindromeTest.isPalindromeFalse();
    }

    public void isPalindromeTrue() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("SaS");
        checkResult(expectedResult, actualResult, "isPalindromeTrue");
    }

    public void isPalindromeFalse() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = false;
        boolean actualResult = palindrome.isPalindrome("sAd");
        checkResult(expectedResult, actualResult, "isPalindromeFalse");
    }

    public static void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }
}
