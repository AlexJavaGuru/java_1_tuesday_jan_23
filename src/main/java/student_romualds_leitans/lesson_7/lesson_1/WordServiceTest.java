package student_romualds_leitans.lesson_7.lesson_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordServiceTest {

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.splitTextIntoWordsTest();
        test.countWordsTest();
        test.findMostFrequentWordInMapTest();
    }
    public void findMostFrequentWordTest(){
        WordService wordService = new WordService();
        String text = "Play, drive, !Sleep!. eat, play? Sleep, jump, draw! SlEEP?";
        String expectedMostFrequentWord = "Sleep";
        String actualMostFrequentWord = wordService.findMostFrequentWord(text);
        check(expectedMostFrequentWord.equals(actualMostFrequentWord),"Find most frequent word test");

    }
    public  void  splitTextIntoWordsTest(){
        WordService wordService = new WordService();
        String text = "Play, drive, !Sleep!. eat, play? Sleep, jump, draw! SlEEP?";
        String [] expectedSplitWords = {"Play","drive","Sleep","eat","play","Sleep","jump","draw","SlEEP"};
        String actualSplitTextIntoWords = wordService.findMostFrequentWord(text);
        check(expectedSplitWords.equals(actualSplitTextIntoWords),"split text in to words test");

    }
    public void countWordsTest(){
        WordService wordService = new WordService();
        String [] words = {"one", "two", "two", "three", "three", "three"};
        Map<String,Integer> expectedCountWords = new HashMap<>();
        expectedCountWords.put("one",1);
        expectedCountWords.put("two",2);
        expectedCountWords.put("three",3);
        String actualSplitTextIntoWords = wordService.findMostFrequentWord(String.valueOf(words));
        check(expectedCountWords.equals(actualSplitTextIntoWords),"Cont words test");
    }

    public void findMostFrequentWordInMapTest (){
        WordService wordService = new WordService();
        String text = "Play, drive, !Sleep!. eat, play? Sleep, jump, draw! SlEEP?";
        String expectedMostFrequentWord = "Sleep";
        String actualMostFrequentWord = wordService.findMostFrequentWord(text);
        check(expectedMostFrequentWord.equals(actualMostFrequentWord),"Find most frequent word in map test: ");
    }




    private void check (boolean condition, String testName){
        if (condition){
            System.out.println(testName + "Test passed");
        } else  {
            System.out.println(testName + "Test Failed");
        }
    }

























}
