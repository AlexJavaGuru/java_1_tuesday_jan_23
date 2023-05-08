package student_dmitry_kupcus.lesson_7;

import java.util.Arrays;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.filterPunctuationAndSplitTest();
        wordServiceTest.findMaxWordCounterTest();
        wordServiceTest.countEachWordTest();
    }

    public void findMostFrequentWordTest() {
        WordService wordService = new WordService();
        String text = "Hello%$@!";
        String expectedResult = "hello";
        String realResult = wordService.findMostFrequentWord(text);
        checkResult(expectedResult, realResult, "findMostFrequentWordTest");
    }


    public void filterPunctuationAndSplitTest() {
        WordService wordService = new WordService();
        String text = "hEllO";
        String expectedResult = "[hello]";
        String realResult = Arrays.toString(wordService.filterPunctuationAndSplit(text));
        checkResult(expectedResult, realResult, "filterPunctuationAndSplitTest");
    }

    public void findMaxWordCounterTest() {
        WordService wordService = new WordService();
        int[] array = {1, 2, 3, 5};
        int expectedResult = 3;
        int realResult = wordService.findMaxWordCounter(array);
        checkResult(expectedResult, realResult, "findMaxWordCounterTest");
    }

    public void countEachWordTest() {
        WordService wordService = new WordService();
        String[] array = {"Hi", "Hi", "Bye", "Yes", "Yes", "Yes"};
        String testWord = "Yes";
        String expectedResult = "[yes]";
        String realResult = Arrays.toString(wordService.filterPunctuationAndSplit(testWord));
        checkResult(expectedResult, realResult, "countEachWordTest");
    }

    public void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }

    public void checkResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }

    public void checkResult(int[] expectedResult, int[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }

    public void checkResult(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test: " + testName + ((char) 27 + "[32m Test passed " + (char) 27 + "[0m"));
        } else {
            System.out.println("Test: " + testName + ((char) 27 + "[31m Test failed " + (char) 27 + "[0m"));
        }
    }
}
