package student_romualds_leitans.lesson_7.lesson_6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.palindromeTestLevel();
        test.palindromeTestRaceCar();
        test.palindromeTestSumSumSumSum();
        test.reverseArrayTest();
        test.textToArrayTest();
    }

    public void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = Fail");

    }

    public void palindromeTestLevel() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("Level");
        checkResult(actualResult, expectedResult, "Palindrome test: Level");
    }

    public void palindromeTestRaceCar() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("RaceCar");
        checkResult(actualResult, expectedResult, "Palindrome test: RaceCar");
    }

    public void palindromeTestSumSumSumSum() {
        Palindrome palindrome = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palindrome.isPalindrome("Deed");
        checkResult(actualResult, expectedResult, "Palindrome test: Deed");
    }

    public void checkResult(char[] actualResult, char[] expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = Fail");
    }

    public  void reverseArrayTest(){
        Palindrome palindrome = new Palindrome();
        char [] letters = {'c','a','r'};
        char [] expectedResult = {'r','a','c'};
        char [] actualResult = palindrome.reverseArray(letters);
        checkResult(actualResult,expectedResult,"Reverse Array");
    }
    public void textToArrayTest (){
        Palindrome palindrome = new Palindrome();
        char [] actualResult = palindrome.textToArray("RaceCar");
        char [] expectedResult = {'r','a','c','e','c','a','r'};
        checkResult(actualResult,expectedResult,"Text to array test");

    }

}