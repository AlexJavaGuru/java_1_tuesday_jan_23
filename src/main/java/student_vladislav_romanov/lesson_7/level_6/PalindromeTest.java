package student_vladislav_romanov.lesson_7.level_6;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTestSucceed();
        palindromeTest.isPalindromeTestFailed();
    }

    public void isPalindromeTestSucceed() {
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean current = palindrome.isPalindrome("Аргентина манит негра");

        printResult(current == expected, "isPalindromeTestSucceed");
    }

    public void isPalindromeTestFailed() {
        Palindrome palindrome = new Palindrome();
        boolean expected = false;
        boolean current = palindrome.isPalindrome("Аргентина");

        printResult(current == expected, "isPalindromeTestFailed");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
    }

}
