package student_ilya_tihonov.lesson_7.level_1;

import java.util.HashMap;
import java.util.Map;


public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.testFindMostFrequentWord();
        wordServiceTest.testRemovePunctuation();
        wordServiceTest.testCountWords();
        wordServiceTest.testFindMaxCountWord();
    }

        public void testFindMostFrequentWord() {
            String text = "test test, apple ;dog book dog apple test name.";
            String expected = "test";

            String actual = WordService.findMostFrequentWord(text);

            if (!expected.equals(actual)) {
                System.out.println("Test failed: expected '" + expected + "', but was '" + actual + "'");
            }
        }

        public void testRemovePunctuation() {
            String text = "test test, apple ;dog book dog apple test name.";
            String expected = "test test apple dog book dog apple test name";

            String actual = WordService.removePunctuation(text);

            if (!expected.equals(actual)) {
                System.out.println("Test failed: expected '" + expected + "', but was '" + actual + "'");
            }
        }

        public void testCountWords() {
            String text = "test test, apple ;dog book dog apple test name.";
            Map<String, Integer> expected = new HashMap<>();
            expected.put("test", 3);
            expected.put("apple", 2);
            expected.put("dog", 2);
            expected.put("book", 1);
            expected.put("name", 1);

            Map<String, Integer> actual = WordService.countWords(text);

            if (!expected.equals(actual)) {
                System.out.println("Test failed: expected '" + expected + "', but was '" + actual + "'");
            }
        }

        public void testFindMaxCountWord() {
            Map<String, Integer> wordCount = new HashMap<>();
            wordCount.put("test", 3);
            wordCount.put("apple", 2);
            wordCount.put("dog", 2);
            wordCount.put("book", 1);
            wordCount.put("name", 1);
            String expected = "test";

            String actual = WordService.findMaxCountWord(wordCount);

            if (!expected.equals(actual)) {
                System.out.println("Test failed: expected '" + expected + "', but was '" + actual + "'");
            }
        }
    }

