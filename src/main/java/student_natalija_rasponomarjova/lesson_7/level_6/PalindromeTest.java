package student_natalija_rasponomarjova.lesson_7.level_6;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest();
        test.noPalindromeTest();
        test.textToCharTest();
        test.reverseArrayTest();
    }

    public void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean fact = palindrome.isPalindrome("Искать такси");
        testResults(expected == fact);
    }

    public void noPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        boolean expected = true;
        boolean fact = palindrome.isPalindrome("Возможно, данные задания для вас слишком сложны");
        testResults(expected == fact);
    }

    public void textToCharTest() {
        Palindrome palindrome = new Palindrome();
        char[] expected = {'t', 'a', 'x', 'i' };
        char[] fact = palindrome.textToChar("taxi");
        testResults(expected.equals(fact));

    }

    public void reverseArrayTest() {
        Palindrome palindrome = new Palindrome();
        char[] text = {'t', 'a', 'x', 'i' };
        char[] expected = {'i', 'x', 'a', 't' };
        char[] fact = palindrome.reverseArray(text);
        testResults(expected.equals(fact));
    }

    public void testResults(boolean condition) {
        if (condition) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}