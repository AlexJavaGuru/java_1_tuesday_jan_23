package student_nikita_visnakovs.lesson_7;

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest tester = new WordServiceTest();
        tester.testFindMostFrequentWord();
        tester.testCountSameWord();
        tester.countSameWordTestV2();
        tester.textToArrayTest();
        tester.testGetMostFrequentWord();
    }

    public void testFindMostFrequentWord() {
        WordService subject = new WordService();
        String text = "name Surname Name name name name surname Surname";
        String expectedResult = "name";
        String actualResult = subject.findMostFrequentWord(text);
        checkResult(expectedResult, actualResult, "Find most frequent word test");
    }
    public void testGetMostFrequentWord() {
        WordService subject = new WordService();
        String text = "Name name Surname surname name surname";
        String[] words = subject.createArrayOfWords(text);
        int[] sameWords = subject.countSameWords(words);
        int expectedResult = 0;
        int actualResult = subject.getMostFrequentWords(words, sameWords);
        checkResult(expectedResult, actualResult, "Get most frequent word test");
    }

    public void testCountSameWord() {
        WordService subject = new WordService();
        String text = "Name name Surname surname name surname";
        String[] words = subject.createArrayOfWords(text);
        int[] expectedResult = {2, 1, 2, 1, 0, 0};
        int[] actualResult = subject.countSameWords(words);
        checkResult(expectedResult , actualResult , "Count same words test");
    }
    public void countSameWordTestV2() {
        WordService subject = new WordService();
        String text = "Don`t have same words in text";
        int[] expectedResult = {0, 0, 0, 0, 0, 0};
        int[] actualResult = subject.countSameWords(text.split(" "));
        checkResult(expectedResult , actualResult , "Count same words test V2");
    }
    public void textToArrayTest(){
        WordService subject = new WordService();
        String text = "Name name NAME naME";
        String[] expectedResult = {"name", "name", "name", "name"};
        String[] actualResult = subject.createArrayOfWords(text);
        checkResult(expectedResult, actualResult, "Text to array test ");
    }


    public void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void checkResult(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
