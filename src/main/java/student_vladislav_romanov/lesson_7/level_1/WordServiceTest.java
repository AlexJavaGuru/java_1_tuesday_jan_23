package student_vladislav_romanov.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.splitStringTest();
        wordServiceTest.areWordsEqualTestSucceed();
        wordServiceTest.areWordsEqualTestFailed();
        wordServiceTest.compareWordsTest();
        wordServiceTest.compareWordMentionsWithCurrentMaxMentionedWordMentionsTest();
        wordServiceTest.incrementCounterTest();
        wordServiceTest.setMaxValuesTest();
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

    public void areWordsEqualTestSucceed() {
        WordService wordService = new WordService();
        boolean expected = true;
        boolean current = wordService.areWordsEqual("Java", "java");
        printResult(current == expected, "areWordsEqualTestSucceed");
    }

    public void areWordsEqualTestFailed() {
        WordService wordService = new WordService();
        boolean expected = false;
        boolean current = wordService.areWordsEqual("Java", "Guru");
        printResult(current == expected, "areWordsEqualTestFailed");
    }

    public void compareWordsTest() {
        WordService wordService = new WordService();
        wordService.setCounter(0);
        wordService.compareWords("Java", "javA");
        int expected = 1;
        int current = wordService.getCounter();
        printResult(current == expected, "compareWordsTest");
    }

    public void compareWordMentionsWithCurrentMaxMentionedWordMentionsTest() {
        WordService wordService = new WordService();
        wordService.setCounter(2);
        wordService.setMaxMentionedWordCounter(1);
        wordService.compareWordMentionsWithCurrentMaxMentionedWordMentions(wordService.getCounter(), "java");
        int expected = 2;
        int current = wordService.getMaxMentionedWordCounter();
        printResult(current == expected, "compareWordMentionsWithCurrentMaxMentionedWordMentionsTest");
    }

    public void incrementCounterTest() {
        WordService wordService = new WordService();
        wordService.setCounter(3);
        int expected = 4;
        wordService.incrementCounter(true);
        int current = wordService.getCounter();
        printResult(current == expected, "incrementCounterTest");
    }

    public void setMaxValuesTest() {
        WordService wordService = new WordService();
        wordService.setMaxValues(6, "Java");
        int expectedCounter = 6;
        String expectedWord = "Java";
        int currentCounter = wordService.getMaxMentionedWordCounter();
        String currentWord = wordService.getMaxMentionedWord();
        printResult(currentWord.equals(expectedWord) && currentCounter == expectedCounter, "setMaxValuesTest");
    }

    public void printResult(boolean result, String test) {
        if (result) {
            System.out.println(test + " test SUCCEED");
        } else {
            System.out.println(test + " test FAILED");
        }
    }

}
