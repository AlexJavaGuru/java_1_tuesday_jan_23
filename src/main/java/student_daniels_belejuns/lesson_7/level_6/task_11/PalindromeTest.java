package student_daniels_belejuns.lesson_7.level_6.task_11;

public class PalindromeTest {
    public static void main(String[]args){
        checkPalindromeTrue();
        checkPalindromeFalse();
    }
    public static void checkPalindromeTrue() {
        isPalindrome palindrome = new isPalindrome();
        String text = "asf asf afs";
        boolean expectedResult = true;
        boolean calculatedResult = palindrome.isPalindrome(text);
        test("Palindrome", expectedResult, calculatedResult);
    }

    public static void checkPalindromeFalse() {
        isPalindrome palindrome = new isPalindrome();
        String text = "asfasf afsfasf afsfasf";
        boolean expectedResult = false;
        boolean calculatedResult = palindrome.isPalindrome(text);
        test("Not Palindrome", expectedResult, calculatedResult);
    }

    public static void test(String actionName, boolean expect, boolean actual) {
        if (expect == actual) {
            System.out.println(actionName + " test is Passed");
        } else {
            System.out.println(actionName + " test is Failed");
        }
    }
}
