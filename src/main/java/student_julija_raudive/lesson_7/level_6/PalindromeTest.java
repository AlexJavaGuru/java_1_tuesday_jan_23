package student_julija_raudive.lesson_7.level_6;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();

        test.isPalindromeAndEvenAmountOfSymbols();
        test.isPalindromeAndOddAmountOfSymbols();
        test.isNotPalindromeAndEvenAmountOfSymbols();
        test.isNotPalindromeAndOddAmountOfSymbols();
        test.isPalindromeAndEvenAmountOfSymbolsManyWords();
        test.isPalindromeAndOddAmountOfSymbolsManyWords();
        test.isNotPalindromeAndEvenAmountOfSymbolsManyWords();
        test.isNotPalindromeAndOddAmountOfSymbolsManyWords();


    }

    public void isPalindromeAndEvenAmountOfSymbols() {
        String word = "Noon";
        boolean realResult = true;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Word is palindrome and has even amount of symbols");

    }

    public void isPalindromeAndOddAmountOfSymbols() {
        String word = "Civic";
        boolean realResult = true;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Word is palindrome and has odd amount of symbols");

    }

    public void isNotPalindromeAndEvenAmountOfSymbols() {
        String word = "flower";
        boolean realResult = false;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Word is not palindrome and has even amount of symbols");
    }

    public void isNotPalindromeAndOddAmountOfSymbols() {
        String word = "Clock";
        boolean realResult = false;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Word is not palindrome and has odd amount of symbols");
    }

    public void isPalindromeAndEvenAmountOfSymbolsManyWords() {
        String word = "No lemon, no melon";
        boolean realResult = true;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Sentence is palindrome and has even amount of symbols");

    }

    public void isPalindromeAndOddAmountOfSymbolsManyWords() {
        String word = "Taco cat";
        boolean realResult = true;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Sentence is palindrome and has odd amount of symbols");
    }

    public void isNotPalindromeAndEvenAmountOfSymbolsManyWords() {
        String word = "Sunny morning";
        boolean realResult = false;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Sentence is not palindrome and has even amount of symbols");
    }

    public void isNotPalindromeAndOddAmountOfSymbolsManyWords() {
        String word = "Roses are red";
        boolean realResult = false;
        boolean result = palindrome.isPalindrome(word);
        checkResults(realResult == result, "Sentence is not palindrome and has odd amount of symbols");
    }

    public void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }


}
