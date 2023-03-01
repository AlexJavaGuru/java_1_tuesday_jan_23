package student_aleksandrs_lezhennikovs.lesson_7.level_1;

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {
        checkSplitStringByWords();
        checkNumberOfOccurrencesInArray();
        checkCounterArray();
        checkIndexOfMaxInArray();
    }

    public static void checkSplitStringByWords() {

        String initialString = "one two one two three five six two one one";
        String[] splitText = initialString.split(" ");
        System.out.println(Arrays.toString(splitText));
    }

    public static void checkNumberOfOccurrencesInArray() {
        WordService wordService = new WordService();
        String initialString = "one two one two three five six two one one";
        String[] splitText = initialString.split(" ");
        int result = wordService.numberOfOccurrencesInArray(splitText, "one");
        System.out.println(result);
    }

    public static void checkCounterArray() {
        WordService wordService = new WordService();
        String initialString = "one two one two three five six two one one";
        String[] splitText = initialString.split(" ");
        int[] checkArray = wordService.makeArrayOfCounter(splitText);
        System.out.println(Arrays.toString(checkArray));
    }

    public static void checkIndexOfMaxInArray() {
        WordService wordService = new WordService();
        String initialString = "one two one two three five six two one one";
        String[] splitText = initialString.split(" ");
        int[] checkArray = wordService.makeArrayOfCounter(splitText);
        int index = wordService.indexOfMaxElementInArray(checkArray);
        System.out.println(index);
    }
}
