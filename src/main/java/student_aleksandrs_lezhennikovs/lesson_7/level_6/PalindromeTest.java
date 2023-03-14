package student_aleksandrs_lezhennikovs.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        checkPalindrome();
        checkNotPalindrome();
    }

    public static void checkPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "sum summus mus";
        boolean expectedResult = true;
        boolean calculatedResult = palindrome.isPalindrome(text);
        check("Palindrome", expectedResult, calculatedResult);
    }

    public static void checkNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "Zsum sum mus mus";
        boolean expectedResult = false;
        boolean calculatedResult = palindrome.isPalindrome(text);
        check("Not Palindrome", expectedResult, calculatedResult);
    }

    public static void check(String actionName, boolean expect, boolean actual) {
        if (expect == actual) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
