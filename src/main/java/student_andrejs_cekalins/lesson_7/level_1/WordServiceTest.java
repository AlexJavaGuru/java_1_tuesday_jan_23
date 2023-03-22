package student_andrejs_cekalins.lesson_7.level_1;


import java.util.Arrays;
import java.util.Objects;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.filterPunctuationAndSplit();
        test.countEachWord();
        test.notCountEachWord();
        test.findMaxWordCounter();
        test.notFindMaxWordCounter();
        test.findMostFrequentWord();
        test.notFindMostFrequentWord();
    }

    public void filterPunctuationAndSplit() {
        WordService wordService = new WordService();
        String text = "Dog, DOG cat Cat cat";
        String[] expectedResult = {"dog", "dog", "cat", "cat", "cat"};
        String[] realResult = wordService.filterPunctuationAndSplit(text);
        checkResultFilterPunctuationAndSplit(realResult, expectedResult, "Filter punctuation and split test");
    }

    public void countEachWord() {
        WordService wordService = new WordService();
        String[] textArray = {"dog", "dog", "cat", "cat", "cat"};
        int[] expectedResult = {2, 2, 3, 3, 3};
        int[] realResult = wordService.countEachWord(textArray);
        checkCountEachWord(realResult, expectedResult, "Count each word test");
    }

    public void notCountEachWord() {
        WordService wordService = new WordService();
        String[] textArray = {"dog", "dog", "cat", "cat", "cat"};
        int[] expectedResult = {1, 1, 3, 3, 3};
        int[] realResult = wordService.countEachWord(textArray);
        checkNotCountEachWord(realResult, expectedResult, "Not count each word test");
    }

    public void findMaxWordCounter() {
        WordService wordService = new WordService();
        int[] wordCountArray = {1, 2, 3, 1, 1,};
        int expectedResult = 2;
        int realResult = wordService.findMaxWordCounter(wordCountArray);
        checkResultMax(realResult, expectedResult, "Find max word counter test");
    }

    public void notFindMaxWordCounter() {
        WordService wordService = new WordService();
        int[] wordCountArray = {1, 2, 3, 1, 1,};
        int expectedResult = 3;
        int realResult = wordService.findMaxWordCounter(wordCountArray);
        checkResultNotMax(realResult, expectedResult, "Not find max word counter test");
    }

    public void findMostFrequentWord() {
        WordService wordService = new WordService();
        String text = "Java lesson is lesson for learning java array at lesson";
        String expectedResult = "lesson";
        String realResult = wordService.findMostFrequentWord(text);
        checkResultFrequentWord(realResult, expectedResult, "Find most frequent word check test");
    }

    public void notFindMostFrequentWord() {
        WordService wordService = new WordService();
        String text = "Java lesson is lesson for learning java array at lesson";
        String expectedResult = "learn";
        String realResult = wordService.findMostFrequentWord(text);
        checkResultNotFrequentWord(realResult, expectedResult, "Find not most frequent word check test");
    }

    private void checkCountEachWord(int[] realResult, int[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
    private void checkNotCountEachWord(int[] realResult, int[] expectedResult, String testName) {
        if (!Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
    private void checkResultFilterPunctuationAndSplit(String[] realResult, String[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

    private void checkResultMax(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

    private void checkResultNotMax(int realResult, int expectedResult, String testName) {
        if (realResult != expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

    private void checkResultFrequentWord(String realResult, String expectedResult, String testName) {
        if (Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

    private void checkResultNotFrequentWord(String realResult, String expectedResult, String testName) {
        if (!Objects.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
