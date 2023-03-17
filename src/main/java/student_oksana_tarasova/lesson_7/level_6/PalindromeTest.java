package student_oksana_tarasova.lesson_7.level_6;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest();
        test.symmetricalAboutTheMiddleTest();
        test.ignoreCaseTest();
        test.notAPalindrome();
    }

    public void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        String text = "А роза упала на лапу Азора";
        Boolean expectedResult = true;
        Boolean realResult = palindrome.isPalindrome(text);
        check(expectedResult == realResult, "isPalindromeTest");
    }

    public void symmetricalAboutTheMiddleTest() {
        Palindrome palindrome = new Palindrome();
        String text = "level";
        Boolean expectedResult = true;
        Boolean realResult = palindrome.isPalindrome(text);
        check(expectedResult == realResult, "symmetrical about the middle");
    }
    public void ignoreCaseTest() {
        Palindrome palindrome = new Palindrome();
        String text = "DFhjhfd";
        Boolean expectedResult = true;
        Boolean realResult = palindrome.isPalindrome(text);
        check(expectedResult == realResult, "ignoreCase ");
    }

    public void notAPalindrome() {
        Palindrome palindrome = new Palindrome();
        String text = "raspberries";
        Boolean expectedResult = false;
        Boolean realResult = palindrome.isPalindrome(text);
        check(expectedResult == realResult, "not a palindrome");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = Fail");
        }
    }
}


