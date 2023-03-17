package student_oksana_tarasova.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.textInArrayTest();
        test.arrayCountWordsTest();
        test.maxRepetitionTest();
        test.findMistFrequentWordTest1();
    }

    public void textInArrayTest() {
        WordService wordService = new WordService();
        String text = "rode across  Greek across the river, sees across  Greek in the river Rak Greek";
        String[] words = {"rode", "across", "greek", "across", "the", "river", "sees", "across", "greek", "in", "the", "river", "rak", "greek"};
        String[] expectedResult = words;
        String[] realResult = wordService.textAsAnArrayWords(text);
        check(Arrays.equals(expectedResult, realResult), "text in array");
    }

    public void arrayCountWordsTest() {
        WordService wordService = new WordService();
        String[] words = new String[]{"rode", "across", "greek", "across", "the", "river", "sees", "across", "greek", "in", "the", "river", "rak", "greek"};
        int[] expectedResult = {1, 3, 3, 3, 2, 2, 1, 3, 3, 1, 2, 2, 1, 3};
        int[] realResult = wordService.repeatedWordsInText(words);
        check(Arrays.equals(expectedResult, realResult), "array count");
    }

    public void maxRepetitionTest() {
        WordService wordService = new WordService();
        String[] words = new String[]{"rode", "across", "greek", "across", "the", "river", "sees", "across", "greek", "in", "the", "river", "rak", "greek"};
        int[] countWord = {1, 3, 3, 3, 2, 2, 1, 3, 3, 1, 2, 2, 1, 3};
        String expectedResult = "across";
        String realResult = wordService.maxRepetition(countWord, words);
        check(expectedResult.equals(realResult), "max repetition word");
    }

    public void findMistFrequentWordTest1() {
        WordService wordService = new WordService();
        String text = "rode across  Greek across the river, sees across  Greek in the river Rak Greek";
        String expectedResult = "across";
        String realResult = wordService.findMostFrequentWord(text);
        check(expectedResult.equals(realResult), "repeating word");
    }

    public void check(boolean state, String nameTest) {
        if (state) {
            System.out.println(nameTest + " = ok");
        } else {
            System.out.println(nameTest + " = fail");
        }
    }
}
