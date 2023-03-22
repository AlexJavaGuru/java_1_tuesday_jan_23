package student_vladislav_romanov.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    int succeedTests;
    int failedTests;

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.splitStringTest();
        wordServiceTest.printStat();
    }

    public void splitStringTest() {
        WordService wordService = new WordService();
        String text = "Java. Is. Programming. Language.";
        String expected = "[Java, Is, Programming, Language]";
        String current = Arrays.toString(wordService.splitString(text));
        printResult(current.equals(expected), "splitStringTest");
    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "Java. Is. Programming. Language. Java helps us.";
        String expectedMention = "Java";
        String currentMention = wordService.findMostFrequentWord(text);
        printResult(currentMention.equals(expectedMention), "findMostFrequentWordTest");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
            succeedTests++;
        } else {
            System.out.println(test + " test FAILED");
            failedTests++;
        }
        System.out.println("----------------------------------------------------------");
    }

    public void printStat() {
        System.out.println(succeedTests + " tests SUCCEED.");
        System.out.println(failedTests + " tests FAILED.");
    }

}
