package student_andrejs_cekalins.lesson_7.level_6.Task_11;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindrome();
        test.notPalindrome();
    }

    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "sum summus mus";
        boolean realResult = true;
        boolean expectedResult = palindrome.isPalindrome(text);
        checkResult(realResult, expectedResult, "Is palindrome test");
    }

    public void notPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "bob non bib";
        boolean realResult = false;
        boolean expectedResult = palindrome.isPalindrome(text);
        checkResult(realResult, expectedResult, "Not palindrome test");
    }

    private void checkResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}

