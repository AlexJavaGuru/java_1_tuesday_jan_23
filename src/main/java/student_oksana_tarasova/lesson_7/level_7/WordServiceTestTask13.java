package student_oksana_tarasova.lesson_7.level_7;

import java.util.Arrays;

class WordServiceTestTask13 {
    public static void main(String[] args) {
        WordServiceTestTask13 test = new WordServiceTestTask13();
        test.textInArrayTest();
        test.countWordsTest();
        test.firstFrequentlyRepeatedWordTest();
        test.findMistFrequentWordTest1();
    }

    public void textInArrayTest() {
        WordServiceTask13 serviceTask13 = new WordServiceTask13();
        String text = "viburnum raspberry currant cherry viburnum cherry currant strawberry viburnum raspberry";
        String[] words = {"viburnum", "raspberry", "currant", "cherry", "viburnum", "cherry", "currant", "strawberry", "viburnum", "raspberry"};
        String[] expectedResult = words;
        String[] realResult = serviceTask13.textAsAnArray(text);
        check(Arrays.equals(expectedResult, realResult), "text in array");
    }

    public void countWordsTest() {
        WordServiceTask13 serviceTask13 = new WordServiceTask13();
        String[] words = {"viburnum", "raspberry", "currant", "cherry", "viburnum", "cherry", "currant", "strawberry", "viburnum", "raspberry"};
        int[] expectedResult = {3, 2, 2, 2, 3, 2, 2, 1, 3, 2};
        int[] realResult = serviceTask13.countWords(words);
        check(Arrays.equals(expectedResult, realResult), "array count");
    }

    public void firstFrequentlyRepeatedWordTest() {
        WordServiceTask13 serviceTask13 = new WordServiceTask13();
        String[] words = {"viburnum", "raspberry", "currant", "cherry", "viburnum", "cherry", "currant", "strawberry", "viburnum", "raspberry"};
        int[] countWord = {3, 2, 2, 2, 3, 2, 2, 1, 3, 2};
        String expectedResult = "viburnum";
        String realResult = serviceTask13.firstFrequentlyRepeatedWord(words, countWord);
        check(expectedResult.equals(realResult), "max repetition word");
    }

    public void findMistFrequentWordTest1() {
        WordServiceTask13 serviceTask13 = new WordServiceTask13();
        String text = "viburnum raspberry currant cherry viburnum cherry currant strawberry viburnum raspberry";
        String expectedResult = "viburnum";
        String realResult = serviceTask13.findMostFrequentWord(text);
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






